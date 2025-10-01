import java.util.Arrays;

class GenericArray<T>{
    private Object[] arr;
    private int size;

    // Constructor
    public GenericArray(int capacity){
        arr=new Object[capacity];
        size=capacity;
    }

    // Add element at index
    public void addElement(int index,T element){
        if(index>=0 && index<size){
            arr[index]=element;
        }else{
            System.out.println("Invalid index!");
        }
    }

    // Get element at index
    @SuppressWarnings("unchecked")
    public T getElement(int index){
        if(index>=0 && index<size){
            return (T)arr[index];
        }
        System.out.println("Invalid index!");
        return null;
    }

    // Print array
    public void printArray(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Search element
    public int searchElement(T element){
        for(int i=0;i<size;i++){
            if(arr[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    // Delete element by index
    public void deleteElement(int index){
        if(index<0 || index>=size){
            System.out.println("Invalid index!");
            return;
        }
        for(int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=null;
        size--;
    }
}

// Main class for tasks
public class MainArrayTasks{
    // Print array function
    static void printArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Insert element
    static int insertElement(int[] arr,int n,int pos,int element){
        if(pos<0||pos>n){
            System.out.println("Invalid Position");
            return n;
        }
        for(int i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=element;
        return n+1;
    }

    // Delete element by value
    static int deleteElement(int[] arr,int n,int key){
        int pos=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                pos=i;
                break;
            }
        }
        if(pos==-1){
            System.out.println("Element not found");
            return n;
        }
        for(int i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        return n-1;
    }

    // Search element
    static int searchElement(int[] arr,int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }

    // Sort array
    static void sortArray(int[] arr,int n){
        Arrays.sort(arr,0,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //Generic Array Example
        System.out.println("Generic Array Example:");
        GenericArray<String> gArr=new GenericArray<>(5);
        gArr.addElement(0,"Hello");
        gArr.addElement(1,"World");
        gArr.addElement(2,"Java");
        gArr.printArray();
        System.out.println("Element at index 1: "+gArr.getElement(1));
        System.out.println("Search 'Java': "+gArr.searchElement("Java"));
        gArr.deleteElement(1);
        System.out.print("After deletion: ");
        gArr.printArray();

        //Task 1: Array Traversal
        System.out.println("\nTask 1: Array Traversal");
        int arr1[]={5,10,15,20,25,30};
        printArray(arr1,arr1.length);

        //Task 2: Linear Search
        System.out.println("\nTask 2: Linear Search");
        int arr2[]={7,14,21,28,35};
        int key=21;
        int pos=searchElement(arr2,arr2.length,key);
        if(pos!=-1) 
            System.out.println("Element found at index "+pos);
        else 
            System.out.println("Element not found");

        //Student Tasks
        System.out.println("\nStudent Tasks:");
        int arr[]=new int[10];
        arr[0]=5;
        arr[1]=52;
        arr[2]=31;
        arr[3]=2;
        int n=4;
        System.out.print("Original: ");
        printArray(arr,n);

        // Insert
        n=insertElement(arr,n,2,99);
        System.out.print("After Insert: ");
        printArray(arr,n);

        // Delete
        n=deleteElement(arr,n,52);
        System.out.print("After Delete: ");
        printArray(arr,n);

        // Search
        int index=searchElement(arr,n,99);
        if(index!=-1) 
            System.out.println("Found at index "+index);
        else
            System.out.println("Not found");

        // Sort
        System.out.print("Sorted: ");
        sortArray(arr,n);
    }
}