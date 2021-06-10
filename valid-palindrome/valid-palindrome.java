class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length() <=1) return true;
        int i = 0;
        int j = s.length()-1;
        char[] c = s.toCharArray();
        while(i < j){
            while(!Character.isLetterOrDigit(c[i]) && i < j){
                i++;
            }
             while(!Character.isLetterOrDigit(c[j]) && i<j){
                j--;
            }
            if(Character.toLowerCase(c[i++])!=Character.toLowerCase(c[j--])) return false;
        }
        return true;
    }
}