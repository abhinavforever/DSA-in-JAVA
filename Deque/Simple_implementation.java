package Deque;

class Deque0 {
    int size,cap;
    int arr[];
    Deque0(int c){
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
    void insertRear(int x){
        if(isFull())
            return;
        arr[size]=x;
        size++;
    }
    void deleteRear(){
        if(isEmpty())
            return;
        size--;
    }
    int getRear(){
        if(isEmpty())
            return -1;
        else
            return (size-1);
    }
    void insertFront(int x){
        if(isFull())
            return;
        for(int i=size-1;i>=0;i--)
            arr[i+1]=arr[i];
        arr[0]=x;
        size++;
    }
    void deleteFront(){
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
}
public class Simple_implementation {
    public static void main(String[] args) {
        Deque0 d=new Deque0(5);
        d.insertRear(10);
        d.insertFront(20);
        d.insertRear(30);
        d.insertFront(40);
        d.deleteFront();
        d.deleteRear();
        System.out.println(d.getFront());
        System.out.println(d.getRear());
        System.out.println(d.arr[0]+" "+d.arr[1]);
    }
}