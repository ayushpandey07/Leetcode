class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res,"",0,0,n);
        return res;
    }
    public void helper(List<String> res , String sb , int o ,int c ,int max){
        if(sb.length() == 2*max){
            res.add(sb.toString());
            return;
        }
        
        if(o < max){
            helper(res,sb+"(",o+1,c,max);
        }
        if(c < o){
            helper(res,sb+")",o,c+1,max);
        }
    }
}