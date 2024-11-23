package Arraylist;
import java.util.*;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        System.out.println(list);
        list.add(12);
        System.out.println(list);

        //get elements
        System.out.println(list.get(1));

        //add elements in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(1,2);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);

        //remove all
        list.removeAll(list);
        System.out.println(list);

        //clear
        list.clear();
        list.add(1);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        
    }
}
