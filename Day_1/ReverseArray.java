import java.util.Scanner;

public class ReverseArray
{
    static void reverseArray(int [] arr)
    {
        int start = 0, end = arr.length - 1, temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
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

        reverseArray(arr);

        System.out.println("Reversed array:");
        for (int ele : arr)
        {
            System.out.print(ele + " ");
        }

        System.out.print("\n");
    }
}
