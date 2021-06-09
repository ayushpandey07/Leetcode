class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] b = new boolean[s.length()+1];
        Set<String> ss = new HashSet<>(wordDict);
        b[0] = true;
        for(int i = 1; i <= s.length() ; i++){
            for(int j =0; j <i ;j++){
                if(b[j] && ss.contains(s.substring(j,i))){
                    b[i] = true;
                    break;
                }
            }
        }
        return b[s.length()];
    }
}