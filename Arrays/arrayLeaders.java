import java.util.ArrayList;

public class arrayLeaders {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> listRes=new ArrayList<>();
        
        int i=arr.length-1;
        int max=0;
        while(i>=0){
            if(arr[i]>max){
                list.add(arr[i]);
                max=Math.max(max, arr[i]);
            }
            i--;
        }
        int j=list.size()-1;
        while(j>=0){
            listRes.add(list.get(j));
            j--;
        }
        System.out.println(listRes);

       
    }
}
