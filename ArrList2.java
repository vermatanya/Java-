//Write a Java program to iterate through all elements in a array list.
import java.util.*;
public class ArrList2{
public static void main(String[] args) {
    List<String> l1 = new ArrayList<String>();
    l1.add("apple");
    l1.add("banana");
    l1.add("grapes");
    l1.add("mango");
    
    for(String i:l1){
        System.out.println(i);
    }
}
}
