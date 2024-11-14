public class removeDuplicate1 {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr.length<=0||arr==null){
                break;
            }
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        // for(int j=0;j<arr.length;j++){
        //     System.out.println(arr[j]);
        // }
        System.out.println(i+1);
        
    }
}
