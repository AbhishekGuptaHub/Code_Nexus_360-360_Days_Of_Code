import java.util.Scanner;

public class SearchInRotatedSortedArray
{
    static int searchInRotatedSortedArray(int [] arr, int target)
    {
        int low = 0, high = arr.length - 1, mid;

        while (low <= high)
        {
            mid = low + (high - low) / 2;

            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] > arr[low])
            {
                if (target >= arr[low] && target < arr[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if (target > arr[mid] && target <= arr[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }

        return -1;
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
        System.out.print("Enter element to be searched: ");
        target = sc.nextInt();

        if (searchInRotatedSortedArray(arr, target) == -1)
        {
            System.out.println("Element not found!");
        }
        else
        {
            System.out.println("Element found at index: " + searchInRotatedSortedArray(arr, target));
        }
    }
}
