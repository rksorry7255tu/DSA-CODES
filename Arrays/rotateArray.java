import java.util.ArrayList;

public class rotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        ArrayList<Integer> list=new ArrayList<>();
        //int arr[]={-1,-100,3,99};
        int arr1[]=new int[arr.length];
        int k=3;
        int l=arr.length-k-1;
        int j=0;
        for(int i=l+1;i<arr.length;i++){
            arr1[j]=arr[i];
            j++;
        }
        for(int i=0;i<l+1;i++){
            arr1[j]=arr[i];
            j++;
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr1[i]);
        // }
        for(int i=0;i<arr.length;i++){
            list.add(arr1[i]);
            
        }
        System.out.println(list);
    }
}
