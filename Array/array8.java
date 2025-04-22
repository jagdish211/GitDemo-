
import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre the row1 value here ");
        int row1 = scan.nextInt();
        System.out.println("----------------------");
        System.out.println("Enter the value of columen1 here:");
        int colume1 = scan.nextInt();
        System.out.println("----------------------");

        int[][] matrix1 = new int[row1][colume1];
        System.out.println("Entre thr element of first matrix");

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < colume1; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("--------------------");

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < colume1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        System.out.println("Enter  the value of row2  here ");
        int row2 = scan.nextInt();
        System.out.println("----------------------");

        System.out.println("Enter the value of columen2 here:");
        int colume2 = scan.nextInt();
        System.out.println("----------------------");

        int matrix2[][] = new int[row2][colume2];
        System.out.println("----------------------");
        System.out.println("Entre thr element of second matrix");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < colume2; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
        System.out.println("----------------------");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < colume2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();

        }

        if (row1 == colume1) {
            int matrix3[][] = new int[row1][colume2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < colume2; j++) {
                    for (int k = 0; k < colume1; k++) {

                        matrix3[i][j] += matrix1[i][k] * matrix2[k][j];

                    }
                }
            }
            System.out.println("----------------------");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < colume2; j++) {
                    System.out.print(matrix3[i][j]+"  ");
                }
                System.out.println();
            }
        }

    }
}