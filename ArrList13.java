/*Write a Java program to compare two array lists.*/
import java.util.*;
public class ArrList13{
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
        for(String e:l1){
            if(l2.contains(e)){
                l3.add("Yes");
            }
            else{
                l3.add("no");
            }
        }
        System.out.println(l3);
        

    }
}
