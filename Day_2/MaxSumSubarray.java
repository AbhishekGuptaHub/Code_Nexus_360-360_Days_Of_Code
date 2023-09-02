import java.util.Scanner;

public class MaxSumSubarray
{
    static int maxSumSubarray(int [] arr)
    {
        int maxSum = Integer.MIN_VALUE, currSum = 0;

        for (int ele : arr)
        {
            currSum += ele;
            maxSum = Math.max(currSum, maxSum);
            currSum = Math.max(0, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of elements in an array: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter all the elements of the array below:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum sum subarray has sum: " + maxSumSubarray(arr));
    }
}
