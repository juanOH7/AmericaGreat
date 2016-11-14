package great;

public class Stack extends LinkedList{

    public Stack() {
        super();
    }
    
    public void Push(Object x){
        insert(x, 0);
    }
    
    public Object Pop(){
        Node tmp = head;
        head = head.getNext();
        size--;
        return tmp.getVal();
    }
    public Object Peek() {
        return head.getVal();
    }
}
