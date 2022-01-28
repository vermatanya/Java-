/*Write a Java program to replace the second element of a ArrayList with the specified element.*/
import java.util.*;
public class ArrList19{
    public static void main(String[] args){
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        System.out.println("List 1: "+l1);

        l1.set(1,"pear");

        System.out.println(l1);
        

    }
}
