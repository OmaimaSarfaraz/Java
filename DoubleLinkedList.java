public class DoubleLinkedList{
    Node head;
    Node tail;
    int size;
    public DoubleLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void addfirst(int data){
        if(head==null){
            Node temp=new Node(data, null, null);
            head=temp;
            tail=temp;
        }
        else{
            Node newnode=new Node(data, head, null);
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }

    public void addlast(int data){
        if(head==null){
            addfirst(data);
        }
        else{
            Node newnode=new Node(data, null, tail);
            tail.next=newnode;
            tail=newnode;
        }
    }

    public void deletefirst(){
        Node temp=head;
        if(head==null){
            System.out.println("No List Exist");
        }
        else{
            temp=temp.next;
            head=temp;
            head.prev=null;
        }
    }

    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("List Is Empty");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" --> ");
                temp=temp.next;
            }
            System.out.println("Null");
        }
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
        DoubleLinkedList marks=new DoubleLinkedList();
        System.out.println("Marks");
        marks.addfirst(100);
        marks.addfirst(90);
        marks.addfirst(70);
        marks.addlast(110);
        marks.addlast(120);
        System.out.println("Before Deletion");
        marks.display();
        marks.deletefirst();
        System.out.println("After Deletion");
        marks.display();
    }
}