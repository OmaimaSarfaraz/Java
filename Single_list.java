package data_structure;
public class Single_list <AnydataType> {
    Node head;
        Node tail;
        int size;
        public Single_list(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
//Add first node
        public void addfirst(AnydataType data){
            Node temp = new Node(data,null);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;

            }
            size++;

        }
        //Add last node
        public void addlast(AnydataType data){
            Node temp = new Node(data,null);
            if(head == null){
                head =temp;
                tail = temp;
            }
            else{
                Node current = head;
                while(current.next != null){
                    current = current.next;
                }
                current.next = temp;
                tail = temp;
            }
            size++;
        }
        public void deletefirst(){
            if(head == null){
                System.out.println("List is Empty");
            }
            else{
                head = head.next;
            }
            size--;
        }
        public void deletelast(){
            if(head == null){
                System.out.println("List is Empty");
            }
            else{
                Node temp = head;
                Node nextnode = temp.next;
                while(nextnode.next != null){
                    temp = nextnode;
                    nextnode = nextnode.next;
                }
                temp.next = null;
            }
            size--;
        }

//Print linked list function

public void display(){
    if(head == null){
        System.out.println("There is no any Node:");
    }
    else{
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}


//Node Class
    private class Node <AnydataType>{
        AnydataType data;
        Node next;
        public  Node(AnydataType data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args){
     Single_list<String> list = new Single_list<>();
     System.out.println("List is created");
    
     System.out.println();

     list.addfirst("Sardar");
     list.addfirst("Ali");
     list.addlast("Mayur");
     list.addlast("Ahmed");
    
     list.display();
     list.deletelast();
     //list.deletefirst();
    
     list.addlast("Imran Khan");
     System.out.println("All elements are added");
     System.out.println();

     list.display();
    
    }
}
