public class removeDuplicate {
    public static void main(String[] args) {

        //just to find the no of unique elements
        int arr[]={0,0,1,1,1,2,2,3,3,4};
       int  count=1;
        int i=0;
       while(i<arr.length-1){
        if(arr.length==1){
            count=1;
            break;
        }
        if(arr[i]==arr[i+1]){
            i++;
        }else{
            count++;
            i++;
        }

       }
       System.out.println(count);
          
    }
}
