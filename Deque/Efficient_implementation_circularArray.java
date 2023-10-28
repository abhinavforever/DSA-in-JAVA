package Deque;

class Deque1{
    int arr[];
    int front,cap,size;
    Deque1(int c){
        arr=new int[c];
        cap=c;
        front=0;
        size=0;
    }
    boolean isFull(){
        return (size==cap);
    }
    boolean isEmpty(){
        return (size==0);
    }
    void deleteFront(){
        if(isEmpty())
            return;
        front=(front+1)%cap;
        size--;
    }
    void insertFront(int x){
        if(isFull())
            return;
        front=(front+cap-1)%cap;
        arr[front]=x;
        size++;
    }
    int getFront(){
        if(isEmpty())
            return -1;
        else
            return front;
    }
    void deleteRear(){
        if(isEmpty())
            return;
        size--;
    }
    void insertRear(int x){
        if(isFull())
            return;
        int new_rear=(front+size)%cap;
        arr[new_rear]=x;
        size++;
    }
    int getRear(){
        if(isEmpty())
            return -1;
        else
            return (front+size-1)%cap;
    }
}
public class Efficient_implementation_circularArray {
    public static void main(String[] args) {
        Deque1 d=new Deque1(4);
        d.insertFront(10);
        System.out.println("a["+d.getFront()+"]"+"="+d.arr[d.getFront()]);
        d.insertRear(20);
        System.out.println("a["+d.getRear()+"]"+"="+d.arr[d.getRear()]);
        d.insertRear(30);
        d.deleteFront();
        d.deleteRear();
        System.out.println(d.getFront());
        System.out.println(d.getRear());
    }
}