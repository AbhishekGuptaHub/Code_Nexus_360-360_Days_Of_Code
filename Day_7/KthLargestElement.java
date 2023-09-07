import java.util.Scanner;

public class KthLargestElement
{
    static int findPivot(int [] arr, int start, int end)
    {
        int j = start - 1;

        for (int i = start; i <= end; i++)
        {
            if (arr[i] <= arr[end])
            {
                int temp = arr[++j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        return j;
    }

    static int kthLargestElement(int [] arr, int start, int end, int k)
    {
        int pivot = findPivot(arr, start, end);

        if (pivot == arr.length - k)
        {
            return arr[pivot];
        }
        else if (pivot > arr.length - k)
        {
            return kthLargestElement(arr, start, pivot - 1, k);
        }
        else
        {
            return kthLargestElement(arr, pivot + 1, end, k);
        }
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

        int k;
        System.out.print("Enter k: ");
        k = sc.nextInt();

        System.out.println("Kth largest element in the array: " + kthLargestElement(arr, 0, n - 1, k));
    }
}
