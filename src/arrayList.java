import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args){
        ArrayList AList = new ArrayList<>();
        AList.add("azeer");
        AList.add(1);
        AList.add("apple");
        AList.add(null);
        AList.remove(2);
        AList.add(1,"my name is:");
        AList.set(3,"my name:");
        System.out.println(AList);
        System.out.println(AList.size());
        System.out.println(AList.indexOf(1));
        System.out.println(AList.lastIndexOf("azeer"));
        System.out.println(AList);
    }
}
