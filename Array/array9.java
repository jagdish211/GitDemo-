 import java.util.Scanner;
//  Swaping of the last array element 
public class array9 
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter thr lenth of an a array ");

        int size =scan.nextInt();
        int array[]= new int [size];

        for(int i =0;i<array.length;i++)
        {
            array[i]=scan.nextInt();
        }
        for(int valu: array)
        {
            System.out.print(valu+" ,");
        }

        for(int i=0 ;i<array.length;i++)
        {
            if(i==array.length-1)
            {
                int temp=array[0];
                array[0]=array[i];
                array[i]=temp;
            }
        }
        System.out.println();

        for(int valu: array)
        {
            System.out.print(valu+" ,");
        }

    }
    
}
