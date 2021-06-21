class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if(s == null || p == null || s.length() < p.length()) return res;
        Map<Character , Integer> mp = new HashMap<>();
        for(char c : p.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int start = 0;
        int matched = 0;
        for(int end = 0 ; end<s.length() ; end++){
            char c = s.charAt(end);
            if(mp.containsKey(c)){
            mp.put(c,mp.get(c)-1);
            if(mp.get(c)==0){
                matched++;
            }
            }
            if(matched == mp.size()){
                res.add(start);
            }
            if(end -start+1 >=p.length()){
                char c1 = s.charAt(start++);
                if(mp.containsKey(c1)){
                if(mp.get(c1) == 0){
                    matched--;
                }
                mp.put(c1,mp.get(c1)+1);
                }
            }
        }
        return res;
    }
}