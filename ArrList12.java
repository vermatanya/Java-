/*Write a Java program to extract a portion of a array list.*/
import java.util.*;
public class ArrList12{
    public static void main(String[] args){
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        System.out.println("List 1: "+l1);

        List<String>sub_list = l1.subList(0,2);
        System.out.println("Sublist of l1: "+ sub_list);
        

    }
}
