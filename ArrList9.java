/*Write a Java program to copy one array list into another. */
import java.util.*;
public class ArrList9{
    public static void main(String[] args){
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        System.out.println("List 1: "+l1);
        
        List<String> l2 = new ArrayList<String>();
        l2.add("1");
        l2.add("2");
        l2.add("3");
        l2.add("4");
        System.out.println("List 2: "+l2);


        Collections.copy(l2,l1);
        System.out.println("After copying: ");
        System.out.println("List 1: "+l1);
        System.out.println("List 2: "+l2);

    }
}
