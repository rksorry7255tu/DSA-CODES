import java.util.ArrayList;


public class missingAndRepeating {
    public static void main(String[] args) {
       
        int arr[]={2,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                list.add(arr[i]);  
            }
            if(i!=arr[i]){
                list.add(i); 
            }
            System.out.print(arr[i]+" ");
        }
        list.reversed();
        System.out.println(list);
    }
}
