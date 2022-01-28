/*Write a Java program to retrieve an element (at a specified index) from a given array list. */
import java.util.*;
public class ArrList4{
    public static void main(String[] args){
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        
        l1.add(0,"pear");
        l1.add(5,"papaya");
        String element = l1.get(0);
        System.out.println(element);

    }
}
