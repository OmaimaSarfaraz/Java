public class ArrayBasic {
    private int[] arr;
    private int size;
    private int capacity;
    public ArrayBasic(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }
    public void add(int element){
        if(size == capacity){
            System.out.println("Array is full");
            return;
        }
        arr[size] = element;
        size++;


    }
    public void delete(int index){
        //check for valid index
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return;
        }
        //SHIFT ELEMENTS TO THE LEFT
        for(int i=index; i<size-1; i++){
            arr[i] = arr[i+1];
        
        }
        size--;
        
      
    }
    public void get(int index){
        if(index <0 || index >=size){
            System.out.println("Invalid Index");
            return;}
        System.out.println("Element at index " + index + " is: " + arr[index]);
    }
    public void display(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        ArrayBasic array = new ArrayBasic(5);
        
        
        array.add(20);
        array.add(30);
        array.add(34);
        array.add(40);
        array.add(50);
        array.display();

    
        array.delete(2);
        array.display();

        System.out.println("After adding new element:");

        array.add(60);
        array.display();

       // int [] arr = new int[5];
       /*  System.out.println("Enter Array Elements:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int j=0; j<arr.length; j++){
            System.err.print(arr[j] + " ");
        }*/
        /*for(int i:arr){
            System.out.print(i+" ");
        }*/
        }
        
    }

