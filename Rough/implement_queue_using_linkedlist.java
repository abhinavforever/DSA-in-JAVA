package Rough;


class node {
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private node front;
    private node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        node newnode = new node(data);
        if (isEmpty()) {
            front = newnode;
            rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
        System.out.println(data + " enqueued to the queue");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            int removedData = front.data;
            front = front.next;
            System.out.println(removedData + " dequeued from the queue");
            if (front == null) {
                rear = null;
            }
        }
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }
}

public class implement_queue_using_linkedlist {
    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("Is the queue empty? " + queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.front());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element after dequeue: " + queue.front());

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}