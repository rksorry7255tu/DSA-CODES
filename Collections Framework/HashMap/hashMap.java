import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String []args){
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println(map);


        //insertion
        map.put("India", 150);
        map.put("US",30);
        map.put("china", 150);
        System.out.println(map);
        map.put("china", 180);
        System.out.println(map);

        //search
        System.out.println(map.containsKey("china"));

        //
        System.out.println(map.get("India"));
        System.out.println(map.get("indonesia"));

        //iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys=map.keySet();
        for(String x:keys){
            System.out.println(x=""+map.get(x));
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
    }
}
