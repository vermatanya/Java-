/*Write a Java program to print all the elements of a ArrayList using the position of the elements.*/
import java.util.*;
public class ArrList20{
    public static void main(String[] args){
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("banana");
        l1.add("grapes");
        l1.add("mango");
        
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        

    }
}
