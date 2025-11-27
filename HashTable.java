import java.util.Hashtable;

class HashNode{
    int key;
    String value;
    HashNode next;
    public HashNode(int key, String value){
        this.key=key;
        this.value=value;
        this.next=null;
    }
}

public class HashTable {
    HashNode[] table;
    int size;
    
    public HashTable(int size){
        this.size=size;
        table=new HashNode[size];
    }

    public int Hashtable(int key){
        return key%size;
    }

    public void put(int key, String value){
        int index = Hashtable(key);
        HashNode newnode=new HashNode(key, value);
        if(table[index]==null){
            table[index]=newnode;
            return;
        }
        HashNode temp=table[index];
        while(temp.next!=null){
            if(temp.key==key){
                temp.value=value;
                return;
            }
                temp=temp.next;
        }
        if(temp.key==key){
                temp.value=value;
                return;
            }
            temp.next=newnode;
    }

    public String Search(int key){
        int index=Hashtable(key);
        HashNode temp= table[index];
        while(temp!=null){
            if(temp.key==key){
                return temp.value;
            }   
            temp=temp.next;
        }
        return null;
    }

    public void remove(int key){
    int index=Hashtable(key);
    HashNode temp=table[index];
    HashNode prev=null;

    while(temp!=null){
        if(temp.key==key){
            if(prev==null) table[index]=temp.next; 
            else prev.next=temp.next;
            return;
        }
        prev=temp;
        temp=temp.next;
    }
    System.out.println("Key not found");
}

    public void print(){
        for(int i=0; i<size; i++){
            System.out.println("Bucket "+i+" : ");
            HashNode temp=table[i];
            while(temp!=null){ 
                System.out.println("["+temp.key+" --> "+temp.value+"]");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable students=new HashTable(5);
        students.put(1, "Omaima");
        students.put(0, "Bakhtawar");
        students.put(5, "Manaal");
        students.put(6, "Mariyam");
        students.put(2, "Salaar");
        students.put(4, "Taaliya");
        students.put(3, "Jihaan");
        students.print();
        System.out.println("Value is: "+students.Search(1));
    }
}