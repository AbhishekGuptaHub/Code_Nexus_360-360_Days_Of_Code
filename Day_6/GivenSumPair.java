import java.util.Scanner;

public class GivenSumPair
{
    static int pivot(int [] arr)
    {
        int left = 0, right = arr.length - 1, mid;

        while (left < right)
        {
            mid = left + (right - left) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1])
            {
                return mid;
            }

            if (arr[mid] >= arr[left] && arr[mid] > arr[right])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        return left;
    }

    static boolean pairWithGivenSum(int [] arr, int target)
    {
        int low, high;

        if (arr[0] < arr[arr.length - 1])
        {
            low = 0;
            high = arr.length - 1;
        }
        else
        {
            low = pivot(arr);
            high = low - 1;
        }

        while (low != high)
        {
            if (arr[low] + arr[high] == target)
            {
                return true;
            }
            else if (arr[low] + arr[high] < target)
            {
                low = (low + 1) % arr.length;
            }
            else
            {
                high = (arr.length + high - 1) % arr.length;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of elements in a rotated sorted array: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter all the elements of the array below:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.print("Enter target sum: ");
        target = sc.nextInt();

        if (pairWithGivenSum(arr, target))
        {
            System.out.println("Pair with target sum exists in the array!");
        }
        else
        {
            System.out.println("Pair with target sum does not exists in the array!");
        }
    }
}
