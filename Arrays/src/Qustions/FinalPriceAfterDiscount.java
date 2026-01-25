package DSA.Arrays.Qustions;

public class FinalPriceAfterDiscount {
    public int[] finalPrices(int[] prices){
        int len =prices.length;
        int[] result = new int[len];

        for(int i=0;i<len-1;i++){
            for(int j=i+1 ; j<len ;j++){
                if(prices[j]<=prices[i]){
                    result[i]=prices[i]-prices[j];
                    break;
                }
                else{
                    result[i]=prices[i];

                }
            }
        }
        result[len-1]=prices[len-1];


        return result;
    }
}
