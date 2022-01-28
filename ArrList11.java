/*Write a Java program to reverse elements in a array list.*/
import java.util.*;
public class ArrList11{
    public static void main(String[] args){
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        System.out.println("List 1: "+l1);

        Collections.reverse(l1);
        System.out.println("After reversing: ");
        System.out.println("List 1: "+l1);

    }
}
