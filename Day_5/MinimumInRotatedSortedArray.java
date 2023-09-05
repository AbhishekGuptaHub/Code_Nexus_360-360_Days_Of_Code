import java.util.Scanner;

public class MinimumInRotatedSortedArray
{
    static int minimumElement(int [] arr)
    {
        int left = 0, right = arr.length - 1, mid;

        while (left < right)
        {
            mid = left + (right - left) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1])
            {
                return arr[mid];
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

        return arr[left];
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

        System.out.println("Minimum element in the array: " + minimumElement(arr));
    }
}
