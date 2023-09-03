import java.util.Scanner;
import java.util.Arrays;

public class ChocolateDistribution
{
    static int minDifference(int [] arr, int m)
    {
        Arrays.sort(arr);

        int left = 0, right = m - 1, minDiff = Integer.MAX_VALUE;

        while (right < arr.length)
        {
            minDiff = Math.min(arr[right] - arr[left], minDiff);
            left++;
            right++;
        }

        return minDiff;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of packets of chocolate: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter no. of chocolates in all the packets below:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int m;
        System.out.print("Enter no. of students: ");
        m = sc.nextInt();

        System.out.println("Required minimum difference: " + minDifference(arr, m));
    }
}
