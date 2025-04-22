import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of row in matrix A :-");
        int ROW = scan.nextInt();
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Enter the number of colume in matrix A :-");
        int COLUMEN = scan.nextInt();
        System.out.println("--------------------------------------------------------------------------");

        int matrix1[][] = new int[ROW][COLUMEN];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMEN; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMEN; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Enter the number of row in matrix B :-");
        int row = scan.nextInt();
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Enter the number of colume in matrix B :-");
        int columen = scan.nextInt();
        System.out.println("--------------------------------------------------------------------------");

        int matrix2[][] = new int[row][columen];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMEN; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columen; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("ADDTIPON OF MATRIX A AND B IS ");
        int matrix3 [] [] =new int [row] [columen];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMEN; j++) {
                matrix3[i][j] =  matrix1[i][j] + matrix2[i][j] ;
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

    }
}