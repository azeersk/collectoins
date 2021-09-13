import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class hashSetOne{
    public static void main(String[] args){
        Set HSet = new HashSet<>();
        Set LHSet = new LinkedHashSet<>();
        HSet.add("Karan");
        HSet.add("karan");
        HSet.add("Karan");
        HSet.add(null);
        System.out.println(HSet);
        LHSet.add("karan");
        LHSet.add("karan2");
        LHSet.add("karan1");
        LHSet.add("karan");
        LHSet.add("karan3");
        LHSet.add("a");
        LHSet.add("Baasha");
        LHSet.add(null);
        System.out.println(LHSet);

    }
}
