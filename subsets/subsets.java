class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        res.add(new ArrayList<Integer>()); 
        for(int n : nums){
            List<List<Integer>> new1 = new ArrayList();

            for(List<Integer> k : res){
                List<Integer> t = new ArrayList<Integer>(k);
                t.add(n);
                new1.add(t);
            }
        res.addAll(new1);
            
        }
        return res;
    }
}