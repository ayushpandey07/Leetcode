class Solution {
    public int maxProfit(int[] prices) {
        // checking for every num if it is smaller than min
        // if yes then replacing this with min
        // if no then subtracting this with min to update result
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0;i<prices.length ; i++){
            if(min > prices[i]){
                min = prices[i];
            }else{
                res = Math.max(res , prices[i] - min);
            }
        }
        return res;
    }
}