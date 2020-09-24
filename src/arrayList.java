
import java.util.ArrayList;
import java.util.Random;
 
/**
 * Basic randomization of array list values
 */
public class arrayList {
 
    public static void main(String[] args) {
        Random num = new Random();
  
        //Creates new list
        ArrayList<Integer> list = new ArrayList<Integer>();
    
        //Random 10 integers into a list from  values of 1 - 100
        for (int i = 0; i <= 10; i++) {
            list.add(num.nextInt(100));
        }
        
        //Prints out the defined above list 
        System.out.println(list);
    }   
}