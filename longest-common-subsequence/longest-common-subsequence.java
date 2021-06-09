class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if(text1 == null || text2 ==null ) return 0;
        int[][] m  = new int[text1.length()+1][text2.length()+1];
        for(int i =1 ; i< m.length ;i++){
            for(int j =1;j<m[0].length;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    m[i][j] = 1+m[i-1][j-1];
                }else{
                    m[i][j] = Math.max(m[i-1][j],m[i][j-1]);
                }
            }
        }
        return m[text1.length()][text2.length()];
    }
}