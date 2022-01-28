/*Write a Java program to sort a given array list. */
import java.util.*;
public class ArrList8{
    public static void main(String[] args){
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        
        l1.add(0,"pear");
        l1.add(5,"papaya");
    
        System.out.println("before sorting:"+l1);
        Collections.sort(l1);
        System.out.println("After sorting:"+l1);
    }
}
