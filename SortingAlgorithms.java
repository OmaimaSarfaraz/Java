package Dsaconceptvisualizer;

import java.util.ArrayList;
import java.util.List;

public class SortingAlgorithms {

    public List<String> BubbleSort(int[] arr){
List<String> steps = new ArrayList<>();

for (int i = 0; i <arr.length-1; i++) {
    for (int j = 0; j < arr.length-i-1; j++) {
   steps.add("Comparing " + arr[j] + " and " + arr[j + 1]);
if (arr[j]>arr[j+1]) {
    steps.add("Swapping " + arr[j] + " and " + arr[j + 1]);
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
}
 }
}
        steps.add("Array sorted using Bubble Sort");
    return steps;
}

 public List<String> InsertionSort(int[] arr){
List<String> steps = new ArrayList<>();
for (int i = 0; i < arr.length-1; i++) {
int minindex=i;
 steps.add("Assuming minimum is " + arr[minindex]);
    for (int j = i+1; j < arr.length; j++) {
          steps.add("Comparing " + arr[minindex] + " with " + arr[j]);
        if (arr[j]<arr[minindex]) {
            minindex=j;
             steps.add("New minimum found: " + arr[minindex]);
        }
    }
int temp=arr[minindex];
arr[minindex]=arr[i];
arr[i]=temp;
   steps.add("Placed minimum at position " + i);
}

     steps.add("Array sorted using Selection Sort");
return steps;
 }
}
