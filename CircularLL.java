public class CircularLL {
    Node head;
    Node tail;
    public CircularLL(){
        this.head=null;
        this.tail=null;
    }

    public void addfirst(int data){
        if(head==null){
            Node newnode= new Node(data, null, null);
            head=newnode;
            tail= newnode;
            head.next=head;
            head.prev=head;    
        }
        else{
            Node newnode=new Node(data, head, null);
            newnode.prev=tail;
            head.prev=newnode;
            tail.next=newnode;
            head=newnode;
            }
    }

    public void addlast(int data){
        if(head==null){
            addfirst(data);
            return;
        }
        else{
            Node temp=new Node(data, null, tail);
            temp.next=head;
            tail.next=temp;
            head.prev=temp;
            tail=temp;
        }
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
        head = null;
        tail = null;
        System.out.println("First node deleted.");
        return;
        }
        head = head.next;    
        head.prev = tail;     
        tail.next = head; 
    }

    public void deleteLast(){
       if(head == null){
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
        head = null;
        tail = null;
        return;
        }
        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
    }

    public void display(){
        if(head==null){
            System.out.println("List is Empty....");
            return;
        }
        Node temp=head;
        do { 
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        } while (temp!=head);
            System.out.print("Return to head");
    }

    private class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data, Node next, Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }

    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.addfirst(10);
        list.addfirst(11);
        list.addlast(9);
        list.addfirst(12);
        list.addlast(8);
        list.display();
        System.out.println();
        list.deleteFirst();
        list.deleteLast();
        System.out.println("After Deleting First and Last");
        list.display();
    }
}
