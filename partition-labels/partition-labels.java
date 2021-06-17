class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        if(s == null || s.length() == 0) return res;
        int first =0;
        int last = 0;
        int[] in = new int[26];
        for(int i =0;i<s.length();i++){
            in[s.charAt(i)-'a'] = i;
        }
        
        for(int i = 0 ; i < s.length() ;i++){
            last = Math.max(last , in[s.charAt(i)-'a']);
            if(i==last){
                res.add(last-first+1);
                first = last+1;
            }
            
        }
        return res;
    }
}