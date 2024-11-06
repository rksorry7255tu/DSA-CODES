import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();


        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //print All 
        System.out.println(set);
        

        //search
        System.out.println(set.contains(1));
        System.out.println(set.contains(-1));

        //delete
        set.remove(1);
        System.out.println(set.contains(1));

        //size
        System.out.println(set.size());

        //getclass
        System.out.println(set.getClass());

        //iterator
        Iterator it=set.iterator();
        //hasNext; next
        
        // for(int i=0;i<set.size();i++){
        //     System.out.println(it.next());
        //     System.out.println(it.hasNext());
        // }
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
