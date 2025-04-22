import java.util.Scanner;
// print a matrix geting input element 
public class array5 {
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

        for(int i=0;i<row;i++)
        {
            for (int j=0 ;j<colume;j++)
            {
                System.out.print(matrix [i] [j]+" ");
           }
           System.out.println();
        }

    }
}
