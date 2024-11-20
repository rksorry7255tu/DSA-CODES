public class buyandSellStock {
    public static void main(String[] args) {
        int prices[]={7,6,4,3,1};
        int i=0;
        int min=prices[0];
        int maxProfit=0;
        while(i<prices.length){
            min=Math.min(min,prices[i]);
            if(prices[i]>min){
                maxProfit=Math.max(maxProfit, prices[i]-min);
            }
            i++;
        }
        System.out.println(maxProfit);
    }
}
