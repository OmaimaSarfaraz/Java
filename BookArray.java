public class BookArray {
    int[] books;
    int capacity;
    int size;

    public BookArray(int capacity) 
    {
        books= new int[capacity];
        this.capacity=capacity;
        this.size=0;
    }

    public void insert(int copies){
        if(size==capacity){
            System.out.println("No Capacity");
            return;
        }
        else{
            books[size]=copies;
            size++;
        }
    }

     public void delete(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return;
        }
        for(int i=index; i<size-1; i++){
            books[i] = books[i+1];
        }
        size--;
    }

    public void display() {
        if (size == 0) {
            System.out.println("No elements found");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(books[i] + " ");
        }
        System.out.println();
    }
    
     public void sort() {
        if (size == 0) {
            System.out.println("No elements found");
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (books[j] > books[j + 1]) {
                    int temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        BookArray book=new BookArray(5);
        book.insert(7);
        book.insert(8);
        book.insert(1);
        book.insert(4);
        book.insert(10);
        System.out.println("Before Deleting");
        book.display();
        book.delete(2);
        System.out.println("After Deleting");
        book.display();
        book.sort();
        System.out.println("After Sorting");
        book.display();
    }
}