import java.util.Scanner;

public class BestTimeToBuyAndSellStock
{
    static int maxProfit(int [] prices)
    {
        int profit = 0, buyingCost = prices[0];

        for (int i = 1; i < prices.length; i++)
        {
            profit = Math.max(prices[i] - buyingCost ,profit);
            buyingCost = Math.min(prices[i], buyingCost);
        }

        return profit;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of days: ");
        n = sc.nextInt();

        int [] prices = new int[n];

        System.out.println("Enter prices of a given stock on given days below:");
        for (int i = 0; i < n; i++)
        {
            prices[i] = sc.nextInt();
        }

        System.out.println("Required maximum profit: " + maxProfit(prices));
    }
}
