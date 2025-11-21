public class StackLL {
    private Node top;
    private int size;

    public StackLL(){
        this.top = null;
        this.size = 0;
    }

    public void push(int data){
        Node newnode = new Node(data);

        newnode.next = top;
        top = newnode;

        size++;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        int popped = top.data;
        top = top.next;
        size--;

        System.out.println(popped + " Popped from stack");
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Last Element " + top.data);
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        StackLL st = new StackLL();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();

        System.out.println("After Pop");
        st.pop();

        st.display();
        st.peek();
    }
}