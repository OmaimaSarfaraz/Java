public class BubbleSort {
    public void Bubble(int[] arr){
        int n = arr.length;
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr = {25, 45, 55, 30, 35, 50, 40, 60};
        sort.Bubble(arr);
        for(int arr1: arr){
            System.out.println(arr1);
        }
    }
}