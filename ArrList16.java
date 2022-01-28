/*Write a Java program to clone an array list to another array list..*/

import java.util.*;
public class ArrList16{
    public static void main(String[] args){
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        System.out.println("List 1: "+l1);

        ArrayList<String> newL1 = (ArrayList<String>)l1.clone();
        System.out.println("Cloned List L1: "+newL1);
        

    }
}
