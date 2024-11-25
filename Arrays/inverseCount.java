public class inverseCount {
    public static void main(String[] args) {
        int arr[]={2, 4, 1, 3, 5};
        //int arr[]={2, 3, 4, 5, 6};
        //int arr[]={10,10,10};
        //int arr[]={57 ,38, 91, 10, 38, 28, 79, 41};

        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
