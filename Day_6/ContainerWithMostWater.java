import java.util.Scanner;

public class ContainerWithMostWater
{
    static int mostWaterStored(int [] heights)
    {
        int left = 0, right = heights.length - 1, mostWater = 0, currWater;

        while (left < right)
        {
            currWater = Math.min(heights[left], heights[right]) * (right - left);
            mostWater = Math.max(currWater, mostWater);

            if (heights[left] == heights[right])
            {
                left++;
                right--;
            }
            else if (heights[left] < heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return mostWater;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of vertical lines: ");
        n = sc.nextInt();

        int [] heights = new int[n];

        System.out.println("Enter heights of the lines below:");
        for (int i = 0; i < n; i++)
        {
            heights[i] = sc.nextInt();
        }

        System.out.println("Maximum amount of water stored: " + mostWaterStored(heights));
    }
}
