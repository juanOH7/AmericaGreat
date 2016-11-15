package great;

public class LinkedList extends List{


    public LinkedList() {
        super();
    }

    public int find(Object otro) {
        Node x = new Node(otro);
        if (isEmpty()) {
            return -1;
        }
        int iter = 0;
        Node temp = head;
        while (iter < size) {
            if (temp.equals(x)) {
                return iter;
            }
            temp = temp.getNext();
            iter++;
        }
        return -1;
    }

    public LinkedList concat(LinkedList other) {
        if (other.isEmpty()) {
            return other;
        } else if (isEmpty()) {
            return this;
        }
        LinkedList neo = new LinkedList();
        Node temp = head;
        int iter = 0;
        while (iter < size) {
            neo.insert(temp, iter);
            temp = temp.getNext();
            iter++;
        }
        int iter2 = 0;
        while (iter2 < other.size) {
            neo.insert(other.get(iter2), iter);
            iter2++;
        }
        return neo;
    }

    @Override
    public void add(Object val) {
        Node tmp = new Node(val);
        if (isEmpty()) {
            head = tmp;
            tail = tmp;
        }
        tail.setNext(tmp);
        tail = tmp;
        size++;
    }

    @Override
    public void insert(Object val, int pos) {
         Node tmp = new Node(val);
        if (isEmpty() && pos == 0) {
            head = tmp;
            tail = tmp;
        } else if (pos == 0) {
            Node temp = new Node(val);
            temp.setNext(head);
            head = temp;
        } else {
            int iter = 0;
            Node temp = head;
            while (iter < pos - 1) {
                temp = temp.getNext();
                iter++;
            }
            Node neu = tmp;
            neu.setNext(temp.getNext());
            temp.setNext(neu);
            if (pos == size) {
                tail = neu;
            }
        }
        size++;
    }

    @Override
    public void delete(int pos) {
        if (!isEmpty()) {
            if (pos == 0) {
                head = head.getNext();
            } else {
                int iter = 0;
                Node temp = head;
                while (iter < pos - 1) {
                    temp = temp.getNext();
                    iter++;
                }
                Node tem = temp.getNext();
                temp.setNext(tem.getNext());
            }
            size--;
        }
    }

    public Object getHead() {
        return head.getVal();
    }

    public Object getTail() {
        return tail.getVal();
    }

    @Override
    public Object get(int pos) {
        if (isEmpty()) {
            return null;
        }
        int iter = 0;
        Node target = head;
        while (iter < pos) {
            target = target.getNext();
            iter++;
        }
        return target.getVal();
    }
}
