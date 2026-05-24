public class BinarySearch {

    public int Binary_Search(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == key){
                return mid;
            } 
            else if(key < arr[mid]){
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int Binary_SearchStr(String[] arr, String key){
        int low = 0; 
        int high = arr.length - 1;

        while(low <= high){ 
            int mid = (low + high) / 2;
            int result = arr[mid].compareTo(key);

            if(result == 0){
                return mid;
            } 
            else if(result < 0){      
                low = mid + 1;
            } 
            else {                   
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] arr = {30, 35, 40, 45, 70, 90};
        System.out.println("Element is at index: " + bs.Binary_Search(arr, 70));

        String[] arrstr = {"Bakhtu", "Mannu", "Mariyam", "Omaima"};
        System.out.println("Element is at index: " + bs.Binary_SearchStr(arrstr, "Mannu"));
    }
}
