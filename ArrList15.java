/*Write a Java program to join two array lists.*/
import java.util.*;
public class ArrList15{
    public static void main(String[] args){
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        System.out.println("List 1: "+l1);

        List<String> l2 = new ArrayList<String>();
        l2.add("apple");
        l2.add("papaya");
        l2.add("pear");
        l2.add("mango");
        System.out.println("List 2: "+l2);

        List<String>l3 = new ArrayList<String>();
        l3.addAll(l1);
        l3.addAll(l2);
        System.out.println(l3);
        

    }
}
