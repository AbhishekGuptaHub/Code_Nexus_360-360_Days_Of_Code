import java.util.Scanner;

public class TrappingRainWater
{
    static int waterTrapped(int [] arr)
    {
        int [] temp1 = new int[arr.length];

        int maxBar = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            maxBar = Math.max(arr[i], maxBar);
            temp1[i] = maxBar;
        }

        int [] temp2 = new int[arr.length];

        maxBar = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--)
        {
            maxBar = Math.max(arr[i], maxBar);
            temp2[i] = maxBar;
        }

        int trapWater = 0;

        for (int i = 0; i < arr.length; i++)
        {
            trapWater += Math.min(temp1[i], temp2[i]) - arr[i];
        }

        return trapWater;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of bars: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter heights of all the bars below:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Amount of water trapped after raining: " + waterTrapped(arr));
    }
}
