import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class practice {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     ArrayList aaList = new ArrayList<>();
     aaList.add(10);
     aaList.add(44);
     aaList.add(20);
     aaList.add(11);
     int a = input.nextInt();
     aaList.add(0,a);
     System.out.println(aaList);
     ArrayList aaList1 = new ArrayList<>();
     aaList1.addAll(aaList);
     aaList1.remove(0);
     aaList1.add(a);
     System.out.println(aaList1);
     String b = input.nextLine();
     String[] az = b.split(",");
     ArrayList list1 = new ArrayList<>(Arrays.asList(az));
     for (Object aa : list1){
         System.out.println(aa);
     }
    }
}
