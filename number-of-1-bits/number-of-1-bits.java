public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // int res = 0;
        //     while(n != 0){
        //         res++;
        //         n = n &(n-1);
        //     }
        // return res;
        
        
       // -------------------------
        int res = 0;
        for(int i =0 ;i <32 ; i++){
            res += ((n>>i)&1);
        }
        return res;
    }
}