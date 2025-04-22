import java.util.Scanner;

// geting input of matrix and print its traspose 
public class array6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of row you wanth to print");
        int row=scan.nextInt();

        System.out.print("Enter the number of colume you wanth to print");
        int colume=scan.nextInt();

        int [] [] matrix =new int [row] [colume];

        System.out.print("Enter the element of matrix ");

        for(int i=0;i<row;i++)
        {
            for (int j=0 ;j<colume;j++)
            {
                matrix [i] [j] =scan.nextInt();
            }
        }
System.out.println("Real matrix ");
        for(int i=0;i<row;i++)
        {
            for (int j=0 ;j<colume;j++)
            {
                System.out.print(matrix [i] [j]+" ");
           }
           System.out.println();
        }
        System.out.println(); 
        System.out.println("Transpose of the matrix ");

        for(int i=0;i<row;i++)
        {
            for (int j=0 ;j<colume;j++)
            {
                System.out.print(matrix [j] [i]+" ");
           }
           System.out.println();
        }

    }
}
