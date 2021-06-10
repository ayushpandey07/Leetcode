class Solution {
    public String longestPalindrome(String s) {
        int[] curr = {0,1};
        for(int i =0;i<s.length();i++){
            int[] odd = getrange(s,i-1,i+1);
            
            int[] even = getrange(s,i,i+1);
            int[] l = odd[1] - odd[0] > even[1]-even[0] ? odd : even;
            
            curr = curr[1]-curr[0] > l[1] -l[0] ? curr : l;
        }
        return s.substring(curr[0],curr[1]);
    }
    
    private int[] getrange(String s , int l , int r){
        while(l >=0 && r< s.length()){
            if(s.charAt(l) != s.charAt(r)){
                break;
            }
            l--;
            r++;
        }
        return new int[]{l+1 , r};
    }
}