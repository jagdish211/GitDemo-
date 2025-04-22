import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of subject");
        int size= scan.nextInt();
        int []marks=new int[size];

        for(int i=0;i<size;i++)
        {
            marks[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(marks[i]+",");
    }
}
    
}
