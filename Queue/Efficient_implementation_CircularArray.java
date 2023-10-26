package Queue;

class Queue1{
    int arr[];
    int front,cap,size;
    Queue1(int c){
        arr=new int[c];
        cap=c;
        front=0;
        size=0;
    }
    boolean isFull(){
        return (cap==size);
    }
    boolean isEmpty(){
        return (size==0);
    }
    int getFront(){
        if(isEmpty())
            return -1;
        else
            return front;
    }
    int getRear(){
        if(isEmpty())
            return -1;
        else
            return (front+size-1)%cap;
    }
    void enque(int x){
        if(isFull())
            return;
        int rear=getRear();
        rear=(rear+1)%cap;
        arr[rear]=x;
        size++;
    }
    void deque(){
        if(isEmpty())
            return;
        front=(front+1)%cap;
        size--;
    }
}
public class Efficient_implementation_CircularArray {
    public static void main(String[] args) {
        Queue1 q=new Queue1(5);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println(q.getFront()+" "+q.getRear());
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.deque();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.deque();
        q.enque(5);
        q.enque(6);
        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }
}