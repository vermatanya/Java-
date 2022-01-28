/*Write a Java program to update specific array element by given element. */
import java.util.*;
public class ArrList5{
    public static void main(String[] args){
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        
        l1.add(0,"pear");
        l1.add(5,"papaya");
    
        System.out.println(l1);
        l1.set(2,"Watermelon");
        System.out.println(l1);

    }
}
