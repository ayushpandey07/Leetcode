class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length()==0 || t.length() == 0) return "";
        int start = 0;
        int minLength = s.length()+1;
        int sub = 0;
        int matched = 0;
        Map<Character , Integer> m = new HashMap<>();
        for(char c : t.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        
        for(int e =0;e < s.length();e++){
            char cc = s.charAt(e);
            if(m.containsKey(cc)){
                m.put(cc,m.get(cc)-1);
                if(m.get(cc)>=0){
                    matched++;

                }
            }
            while(matched == t.length()){

                if(minLength > e-start+1){
                    minLength = e-start+1;
                    sub = start;
                }
                
                char left = s.charAt(start++);
                if(m.containsKey(left)){
                    if(m.get(left) ==0 ){
                        matched--;
                    }
                    m.put(left , m.get(left)+1);
                }
            }
        }
        return minLength > s.length() ? "" : s.substring(sub , sub+minLength);
        
    }
}