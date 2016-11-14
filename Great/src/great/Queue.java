package great;

public class Queue extends LinkedList {

    public Queue() {
        super();
    }

    public void Queue(Object x) {
        add(x);
    }

    public Object Dequeue() {
        Node temp = head;
        head = head.getNext();
        size--;
        return temp.getVal();
    }

    public Object Peek() {
        return head.getVal();
    }
}
