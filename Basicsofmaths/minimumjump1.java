public class minimumjump1 {
    public static void main(String[] args) {
        //int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
         //int arr[]={1, 4, 3, 2, 6, 7};
         int arr[]={0, 10, 20};
         int count=0;
        int sum=0;
        int i=0;
        int index=0;
        while(i<arr.length){
            if(arr[i]==0){
                count=-1;
                break;
            }
            sum=sum+arr[i];
          //System.out.println(sum);
          
           System.out.println(i);
           if(i<arr.length-1){
             i=i+arr[i];
             count++;
           }else{
            break;
           }
        }
        System.out.println(count);
    }
}
