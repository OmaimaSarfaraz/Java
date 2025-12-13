public class Linear_Search {

    public int LinearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public void LinearSearch2DArr(int[][] arr, int key){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == key){
                    System.out.println("Found at: " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }

     public int LinearSearchStr(String[] arr, String key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Linear_Search l = new Linear_Search();

        int[] arr = {10, 2, 50, 40, 35};
        System.out.println("The Element is at index: " + l.LinearSearch(arr, 35));

        int[][] arr2 = {
            {10, 2, 50},
            {7, 40, 35}
        };
        l.LinearSearch2DArr(arr2, 7);

        String[] arrstr = {"Mannu", "Mariyam", "Bakhtu", "Omaima"};
        System.out.println(l.LinearSearchStr(arrstr, "Omaima"));
    }
}