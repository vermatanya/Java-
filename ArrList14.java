/*Write a Java program of swap two elements in an array list.*/
import java.util.*;
public class ArrList14{
    public static void main(String[] args){
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        System.out.println("List 1: "+l1);

        Collections.swap(l1,0,2);
        System.out.println(l1);
        

    }
}
