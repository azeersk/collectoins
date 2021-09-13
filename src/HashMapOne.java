import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class HashMapOne {
    public static void main(String[] args){
        Map mapOn = new HashMap<>();
        mapOn.put("name","Azeer");
        mapOn.put("id","11805521");
        mapOn.put("name1","Saheb");
        mapOn.put("phoneNo","9381587797");
        System.out.println(mapOn);
        mapOn.put("name","sszeer");
        System.out.println(mapOn);
        Set KeySet = mapOn.keySet();
        System.out.println(KeySet);
        Collection values = mapOn.values();
        System.out.println(values);
        System.out.println(mapOn.containsValue("sszeer"));
    }
}
