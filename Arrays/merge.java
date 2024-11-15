import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class merge {
   
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr1[]={};
        ArrayList list=new ArrayList<>();
        
        int res[]=new int[arr.length+arr1.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
            j=i;
        }
        for(int i=0;i<arr1.length;i++){
            res[j+i+1]=arr1[i];
        }
       
        Arrays.sort(res);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        list.add(res[0]);
        for(int i=1;i<res.length;i++){
            if(res[i-1]!=res[i]){
               list.add(res[i]);
            }
        }
        System.out.println(list);


       
    }

}
