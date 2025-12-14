public class BubbleSortStr {
    public void Bubble(String[] arr){
        int n = arr.length;
        for(int i=0; i<arr.length-1;i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        BubbleSortStr sort = new BubbleSortStr();
        String[] arr = {"Omaima", "Manaal", "Mariyam", "Bakhtawar"};
        sort.Bubble(arr);
        for(String arr1: arr){
            System.out.println(arr1);
        }
    }
}