import java.util.ArrayList;
import java.util.HashSet;

public class pascalTriangle {
    public static void main(String[] args) {


        //self trying 
        pascalTriangle p = new pascalTriangle();
        int row = 5;
        ArrayList<Integer> list = new ArrayList<>();
       ArrayList<ArrayList<Integer> > listlist=new ArrayList<>();
        if(row==1){
            list.add(1);
           System.out.println(list);
           listlist.add(list);
        }else if(row==2){
            for(int i=0;i<row;i++){
                list.add(1);
                System.out.println(list);
                listlist.add(list);
            }
            
        }else if(row>=3){
            list.add(1);
            listlist.add(list);
            list.removeAll(list);
            for(int i=0;i<2;i++){
                list.add(1);    
            }
            
            listlist.add(list);
            list.removeAll(list);
            list.add(1);
            list.add(1);
            System.out.println(p.pascalTriangles(row, list,listlist));
        }

        
    }

    public ArrayList<ArrayList<Integer>> pascalTriangles(int row, ArrayList<Integer> list,ArrayList<ArrayList<Integer>> listlist) {
        if (row >= 2) {
            
            if (list.size() == row) {
                return listlist;
            }
            ArrayList<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                if (i == 0 || i == list.size() - 1) {
                    list1.add(1);
                }
                list1.add(list.get(i) + list.get(i + 1));
                
            }
            list1.add(1);
            //System.out.println(list1);
            listlist.add(list1);
            pascalTriangles(row, list1,listlist);
        }
        return listlist;
    }
    
}
