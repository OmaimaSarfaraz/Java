class Min{
    public static void main(String[]a){
        int arr[]={4,2,9,1,5},m=arr[0];
        for(int i:arr)
            if(i<m)
                m=i;
        System.out.println(m);
    }
}