import java.util.*;

public class SumOfElement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Entre thr size of array");
        int size =scan.nextInt();
        System.out.println("Entre thr array element");
        int [] array =new int[size];
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            array[i]=scan.nextInt();
        }
        
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
        }
        System.out.println(sum);

    }
    
}
