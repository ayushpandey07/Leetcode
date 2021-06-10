class Solution {
        
int count = 0;
    public int countSubstrings(String s) {
        if(s == null || s.length()==0) return 0;
        for(int i = 0 ; i < s.length() ; i++){
            pal(s , i , i ); //odd
            pal(s,i ,i+1); //even
        }
            return count;
    }
            
            private void pal(String s , int l , int r ){
                while(l >=0 && r <s.length()){
                    if(s.charAt(l) == s.charAt(r)){
                        count++;
                        l--;
                        r++;
                    }else{
                        break;
                        
                    }
                }
            }
}