class Solution {
    public List<String> letterCasePermutation(String s) {
        if(s == null){
            return new ArrayList<String>();
            
            
        }
        
        Queue<String> q = new LinkedList<>();
        q.add(s);
        for(int i = 0 ; i< s.length() ;i++){
            if(Character.isDigit(s.charAt(i))) continue;
            int size = q.size();
            for(int j = 0 ; j<size; j++){
                String curr = q.poll();
                char[] c = curr.toCharArray();
                c[i] = Character.toLowerCase(c[i]);
                q.add(String.valueOf(c));
                c[i] = Character.toUpperCase(c[i]);
                q.add(String.valueOf(c));
            }
        }
        return new LinkedList<>(q);
    }
}

// class Solution {
//     public List<String> letterCasePermutation(String S) {
//         if (S == null) {
//             return new LinkedList<>();
//         }
        
//         List<String> res = new LinkedList<>();
//         helper(S.toCharArray(), res, 0);
//         return res;
//     }
    
//     public void helper(char[] chs, List<String> res, int pos) {
//         if (pos == chs.length) {
//             res.add(new String(chs));
//             return;
//         }
//         if (chs[pos] >= '0' && chs[pos] <= '9') {
//             helper(chs, res, pos + 1);
//             return;
//         }
        
//         chs[pos] = Character.toLowerCase(chs[pos]);
//         helper(chs, res, pos + 1);
        
//         chs[pos] = Character.toUpperCase(chs[pos]);
//         helper(chs, res, pos + 1);
//     }
// }