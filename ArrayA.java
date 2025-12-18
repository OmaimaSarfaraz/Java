package Dsaconceptvisualizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

  private int[] arr;
    private int size;

    public Array(int size) {
        this.size = size;
        arr = new int[size];
        Arrays.fill(arr, -1); // -1 means empty slot
    }

    public int[] getArray() {
        return arr;
    }

    // Insert value at index with step logging
    public List<String> insert(int index, int value) {
        List<String> steps = new ArrayList<>();
        steps.add("Start Insertion: value = " + value + ", index = " + index);

        if (index < 0 || index >= size) {
            steps.add("Error: Index out of range!");
            return steps;
        }

        steps.add("Shifting elements to the right...");

        for (int i = size - 1; i > index; i--) {
            arr[i] = arr[i - 1];
            steps.add("Shifted element from position " + (i - 1) + " to " + i);
        }

        arr[index] = value;
        steps.add("Inserted value " + value + " at index " + index);

        return steps;
    }

    // Search value
    public List<String> search(int value) {
        List<String> steps = new ArrayList<>();
        steps.add("Start Searching: value = " + value);

        for (int i = 0; i < size; i++) {
            steps.add("Checking index " + i);

            if (arr[i] == value) {
                steps.add("Value found at index " + i);
                return steps;
            }
        }
        steps.add("Value NOT found in array");
        return steps;
    }

    // Delete value at index
    public List<String> delete(int index) {
        List<String> steps = new ArrayList<>();

        steps.add("Start Deletion: index = " + index);

        if (index < 0 || index >= size) {
            steps.add("Error: Index out of range!");
            return steps;
        }

        steps.add("Shifting elements to the left...");

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
            steps.add("Shifted element from " + (i + 1) + " to " + i);
        }

        arr[size - 1] = -1;
        steps.add("Last element set to empty");

        return steps;
    }
}
