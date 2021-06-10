class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '[') ss.push(']');
            else             if(c == '{') ss.push('}');
else             if(c == '(') ss.push(')');
else if( ss.isEmpty() ||ss.pop() != c ) return false;
        }
        return ss.isEmpty();
    }
}