public class QueueArray {
    int[] queue;
    int front;
    int rear;
    int size;

    public QueueArray(int capacity){
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public boolean isFull(){
        return (rear+1) % size == front;
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full, Unable to enqueue");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1) % size;
        queue[rear]=data;
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is Empty....");
            return;
        }
        int data = front;
        System.out.println("Queue: ");
        while(true){
            System.out.print(queue[data] +" ");
            if(rear == data) break;
                data = (data+1) % size;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is full, Unable to dequeue");
            return -1;
        }
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front += 1;
        }
        return queue[front-1];
    }

    public static void main(String[] args){
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(10);
        q.print();
        System.out.println("\nAter Dequeue: "+q.dequeue());
        q.print();
         System.out.println("\nAter Dequeue: "+q.dequeue());
        q.print();
         System.out.println("\nAter Dequeue: "+q.dequeue());
        q.print();
    }
}
