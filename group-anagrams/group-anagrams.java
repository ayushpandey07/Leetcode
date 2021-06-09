class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>>  res = new ArrayList<ArrayList<String>>();
        Map<String , List<String>> res = new HashMap<>();
        for(String s : strs){
            String key = hash(s);
            if(!res.containsKey(key)) res.put(key,new LinkedList<>());
            res.get(key).add(s);
        }
        return  new ArrayList<>(res.values());

    }
    private String hash(String s){
        int[] a = new int[26];
        for(char c: s.toCharArray()){
            a[c-'a']++;
        }
        return Arrays.toString(a);
    }
}