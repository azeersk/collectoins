import java.util.LinkedList;
public class linkedListSecond{
    public static void main(String[] args){
        LinkedList LList = new LinkedList<>();
        LList.add("azeer");
        LList.add("azeer1");
        LList.add("azeer2");
        LList.add("azeer3");
        LList.add("azeer4");
        LList.add("azeer5");
        System.out.println(LList);
        LList.addLast("azeer6");
        LList.addFirst("My name is azeer:");
        LList.removeLast();
        LList.removeLast();
        LList.removeFirst();
        System.out.println(LList.getLast());
        System.out.println(LList.getFirst());
        System.out.println(LList);
    }
}
