import java.util.Scanner;

public class MaxAndMinInArray
{
    static int maxElement(int [] arr)
    {
        int maxEle = Integer.MIN_VALUE;

        for (int ele : arr)
        {
            maxEle = Math.max(ele, maxEle);
        }

        return maxEle;
    }

    static int minElement(int [] arr)
    {
        int minEle = Integer.MAX_VALUE;

        for (int ele : arr)
        {
            minEle = Math.min(ele, minEle);
        }

        return minEle;
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

        System.out.println("Maximum element in the array: " + maxElement(arr));
        System.out.println("Minimum element in the array: " + minElement(arr));
    }
}
