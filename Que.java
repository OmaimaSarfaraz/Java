public class Que{
    int f=-1,r=-1;
    int arr[]=new int[5];
    void enqueue(int x){
        if(r==4)
            System.out.println("Overflow");
        else{
            if(f==-1)
                f=0;
                arr[++r]=x;
            }
    }
    int dequeue(){
            if(f==-1||f>r){
                System.out.println("Underflow");
                return -1;
            }
            return arr[f++];
    }
    void display(){
        for(int i=f;i<=r;i++)
            {System.out.print(arr[i]+" ");
            System.out.println();}
    }
public static void main(String[]a){
    Que q=new Que();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.display();
    System.out.println("Dequeued:"+q.dequeue());
    q.display();
    }
}