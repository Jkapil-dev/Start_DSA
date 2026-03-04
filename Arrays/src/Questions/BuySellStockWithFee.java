package DSA.Arrays.Questions;

public class BuySellStockWithFee {
    public static void main(String[] args) {
            int[] prices1= {1,3,2,8,4,9};
            int[] prices2={1,3,7,5,10,3};
            int profit = maxProfit(prices2 , 3);
        System.out.println(profit);
    }
    public static  int maxProfit(int[] prices, int fee) {
        int cash=0;
        int hold=-prices[0];

        for (int price : prices){
            cash=Math.max(cash, price + hold - fee);
            hold=Math.max(hold, cash-price);
        }
        return cash;
    }
}
