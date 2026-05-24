public class QueueLL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node front;
    Node rear;

    public QueueLL(){
        front=null;
        rear=null;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int data){
        Node newnode=new Node(data);
        if(isEmpty()){
            front=newnode;
            rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty, Unable to dequeue");
            return -1;
        }
        int val=front.data;
        front=front.next;
        if(front==null) rear=null;
        return val;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty....");
            return;
        }
        Node temp=front;
        System.out.println("Queue: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        QueueLL q=new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(10);
        q.display();
        System.out.println("\nAfter Dequeue: "+q.dequeue());
        q.display();
        System.out.println("\nAfter Dequeue: "+q.dequeue());
        q.display();
        System.out.println("\nPeek: "+q.peek());
    }
}