import java.util.Scanner;
import java.util.HashSet;

public class ContainsDuplicate
{
    static boolean containsDuplicate(int [] arr)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int ele : arr)
        {
            set.add(ele);
        }

        return !(set.size() == arr.length);
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

        if (containsDuplicate(arr))
        {
            System.out.println("Given array contains duplicate elements!");
        }
        else
        {
            System.out.println("Given array contains no duplicate elements!");
        }
    }
}
