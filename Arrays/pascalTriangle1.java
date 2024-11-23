import java.util.ArrayList;
import java.util.List;

public class pascalTriangle1 {
    public static void main(String[] args) {
       List<List<Integer>> listlist=new ArrayList<>();
        
       
        int r=5;
        
        for(int i=1;i<=r;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=1;j<=i;j++){
                int res=printNCR(i-1,j-1);
                list.add(res);
            }
            listlist.add(list);
        }
        System.out.println(listlist);
    }
    public static int printNCR(int r,int c){
        int res=1;
        for(int i=0;i<c;i++){
            res=res*(r-i);
            res=res/(i+1);
        }
        return res;
    }
}
