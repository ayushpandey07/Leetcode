class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] c = new int[amount+1];
        Arrays.fill(c,Integer.MAX_VALUE);
        c[0] = 0;
        for(int co : coins){
            for(int i = 0 ; i <= amount ;i++){
                if(co<=i && c[i-co] != Integer.MAX_VALUE){
                    c[i] = Math.min(c[i] , c[i-co]+1);
                }
            }
        }
        return c[amount] == Integer.MAX_VALUE ? -1 :c[amount];
    }
}