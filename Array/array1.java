// package Array;

// wap to take input from user and get subject and its marks
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of subject");
        int size= sc.nextInt();
        int[] marks=new int[size];
        
      


        System.out.println(" Enter the Marks of subject");
        for(int i=0;i<size;i++)
        {
            marks [i]=sc.nextInt();
        }


        for(int i=0;i<size;i++)
        {
            
            System.out.println(marks[i]);
        }

        
    }
    
}
