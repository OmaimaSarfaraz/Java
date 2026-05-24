public class ArrayManagers {
    //Task 1
    int[] arr;
    int capacity;
    int size;

    // Task 2
    public ArrayManagers(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        this.size = 0;
    }

    // Task 3
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("No Capacity");
            return;
        }
        arr[size] = value;
        size++;
    }

    // Task 4
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Task 5
    public void display() {
        if (size == 0) {
            System.out.println("No elements found");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Task 6
    public void sort() {
        if (size == 0) {
            System.out.println("No elements found");
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Task 7
    public static void main(String[] args) {
        ArrayManagers marks = new ArrayManagers(6);
        marks.insert(100);
        marks.insert(90);
        marks.insert(80);
        marks.insert(70);
        marks.insert(60);

        System.out.println("Before Deletion And Sorting:");
        marks.display();

        marks.delete(4);
        marks.sort();

        System.out.println("After Deletion And Sorting:");
        marks.display();
    }
}
