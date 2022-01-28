/*Write a Java program to search an element in a array list. */
import java.util.*;
public class ArrList7{
    public static void main(String[] args){
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        
        l1.add(0,"pear");
        l1.add(5,"papaya");
    
        if(l1.contains("apple")){
            System.out.println("Found the element");
        }
        else{
            System.out.println("Element not found");
        }

    }
}
