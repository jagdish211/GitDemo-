import java.util.Scanner;

public class ArrayPairs2 {

    static int sumof(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        // Iterate through the array using two loops to check all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // Corrected inner loop: increment 'j' instead of 'i'
                if ((arr[i] + arr[j]) == target) {  // Check if sum of pair is equal to target
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of array:");
        int size = scan.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // Input target sum
        System.out.println("Enter the target sum:");
        int target = scan.nextInt();

        // Calculate and print the result
        System.out.println("Total number of pairs whose sum equals " + target + " is: " + sumof(arr, target));
    }
}
