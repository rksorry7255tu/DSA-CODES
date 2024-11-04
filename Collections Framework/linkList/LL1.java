import java.util.LinkedList;

public class LL1 {
    public static void main(String[] args) {
        LinkedList <String> list=new LinkedList<>();
        list.add("Ravi");
        list.addLast("is");
        list.addFirst("is");
        System.out.println(list);
        //size
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.add("ravi");
        list.addLast("kumar");
        list.addFirst("hmm");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        
        list.set(0, "hmm1");
        System.out.println(list);
    }
}
