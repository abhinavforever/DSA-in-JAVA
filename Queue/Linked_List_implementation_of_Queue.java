package Queue;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class Queue2{
    Node front,rear;
    int size;
    Queue2(){
        front=rear=null;
        size=0;
    }
    void enque(int x){
        Node temp=new Node(x);
        size++;
        if(front==null){
            front=rear=temp;
            return;
        }
        rear.next=temp;
        rear=temp;
    }
    void deque(){
        if(front==null)
            return;
        size--;
        front=front.next;
        if(front==null)
            rear=null;
    }
}
public class Linked_List_implementation_of_Queue {
    public static void main(String[] args) {
        Queue2 q=new Queue2();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.deque();
        q.enque(5);
        System.out.println(q.front.data);
        System.out.println(q.front.next.data);
        System.out.println(q.rear.data);
        System.out.println(q.size);
    }
}