class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        
        //ways to climb first step is 1
        //ways to climb second step is 2 
        //ways to climb nextstep will be pre and beforePre
        int first = 1;
        int second = 2;
        for(int i =3 ;i <=n ;i++){
            int third = first+ second;
            first = second;
            second = third;
        }
        return second;
    }
}