/*Write a Java program to test an array list is empty or not.. */
import java.util.*;
public class ArrList18{
    public static void main(String[] args){
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        System.out.println("List 1: "+l1);

        l1.removeAll(l1);

        System.out.println("List is empty?: "+l1.isEmpty());
        

    }
}
