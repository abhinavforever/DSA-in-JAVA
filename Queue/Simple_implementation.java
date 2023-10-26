package Queue;

class Queue0 {
    int size,cap;
    int [] arr;
    Queue0(int c){
        cap=c;
        size=0;
        arr=new int[cap];
    }
    boolean isFull(){
        return (size==cap);
    }
    boolean isEmpty(){
        return (size==0);
    }
    void enque(int x){
        if(isFull())
            return;
        arr[size]=x;
        size++;
    }
    void deque(){
        if(isEmpty())
            return;
        for(int i=0;i<size-1;i++)
            arr[i]=arr[i+1];
        size--;
    }
    int getFront(){
        if(isEmpty())
            return -1;
        else
            return 0;
    }
    int getRear(){
        if(isEmpty())
            return -1;
        else
            return size-1;
    }
    int front(){
        return arr[0];
    }
}
public class Simple_implementation {
    public static void main(String[] args) {
        Queue0 q=new Queue0(5);
        System.out.println(q.isFull()+" "+q.isEmpty());
        System.out.println(q.getFront()+" "+q.getRear());
        q.deque();
        q.enque(5);
        q.enque(4);
        q.enque(3);
        q.enque(-1);
        System.out.println("Queue is:");
        for (int i = 0; i < q.size; i++) {
            System.out.print(q.arr[i] + " ");
        }
        System.out.println();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.size);
        q.deque();
        System.out.println(q.front());
        System.out.println(q.arr[1]);
    }
}