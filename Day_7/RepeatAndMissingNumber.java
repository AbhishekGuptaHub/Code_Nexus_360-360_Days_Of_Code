import java.util.Scanner;

public class RepeatAndMissingNumber
{
    static int [] repeatAndMissing(int [] arr, int n)
    {
        int [] ans = new int[2];

        for (int i = 0; i < n; i++)
        {
            if (arr[Math.abs(arr[i]) - 1] > 0)
            {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            }
            else
            {
                ans[0] = i + 1;
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > 0)
            {
                ans[1] = i + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of elements in an unsorted array: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter all the elements of the array below:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int [] ans;
        ans = repeatAndMissing(arr, n);

        System.out.println("Repeating element in the array: " + ans[0]);
        System.out.println("Missing element in the array: " + ans[1]);
    }
}
