class Solution {
    public int longestStrChain(String[] words) {
        Map<String , Integer> tt = new HashMap<>();
        Arrays.sort(words, (a,b) ->Integer.compare( a.length() , b.length()));
        int res = 1;
        
        for(String w : words){
            int localMax = 1;
            for(int j = 0 ; j<w.length() ; j++){
                StringBuilder sb = new StringBuilder(w);
                sb.deleteCharAt(j);
                localMax = Math.max(localMax ,tt.getOrDefault(sb.toString(),0)+1);
            }
            tt.put(w , localMax);
            res = Math.max(res , localMax);
        }
        return res;
    }
}