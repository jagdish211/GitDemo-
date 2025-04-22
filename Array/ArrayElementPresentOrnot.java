import java.util.*;
public class ArrayElementPresentOrnot {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Entre thr size of array");
        int size =scan.nextInt();
        System.out.println("Entre thr array element");
        int [] array =new int[size];
    

        for(int i=0;i<array.length;i++)
        {
            array[i]=scan.nextInt();
        }
        int element=scan.nextInt();
        boolean x=false;

        System.out.println("Entre thr elemnet you wanth to cheack is present or not");
        for(int i=0;i<array.length;i++)
        {
            if (array[i]==element)
            {
                System.out.println("present");
            }
        }
    
    
}
}
