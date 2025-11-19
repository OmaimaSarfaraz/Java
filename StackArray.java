public class StackArray {
    private int[] arr;
    private int size;
    private int capacity;

    public StackArray(int capacity){
        this.size=0;
        this.capacity=capacity;
        this.arr=new int[capacity];
    }

    public void push(int data){
        if(isfull()){
            System.out.println("Stack is full");
            return;
        }
        arr[size]=data;
        size++;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        int popped=arr[size-1];
        size--;
        System.out.println(popped+" Popped from stack");
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
       
        System.out.println("Last Element "+arr[size-1]);
        
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isfull(){
        return size==capacity;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray id=new StackArray(6);
        id.push(1);
        id.push(2);
        id.push(3);
        id.push(4);
        id.push(5);
        id.push(6);
        id.display();
        System.out.println("After Pop");
        id.pop();
        id.display();
        id.peek();
    }
}
