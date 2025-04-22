import java.util.ArrayList;
public class arraylist1 {

    public static void main(String[] args) {

        // initilizeing of aaray list 
        ArrayList <Integer> list =new ArrayList<Integer>();

        // Addting element in array list 
        list.add(1);
        list.add(2);
        System.out.println(list);

        // adding element in between any pozition 
        list.add(0,4);
        System.out.println(list);

        // updating element in array list 
        list.set(0,30);
        System.out.println(list);

        // printing array elemment any one 
        int x=list.get(2);
        System.out.println(x);

        // print size of the array list 
        int y=list.size();
        System.out.println(y);

        // removing element in the array list 
        list.remove(0);
        System.out.println(list);

        
    }
    
}
