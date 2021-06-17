class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        res.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        int begin = 0;
        for(int i=0;i<nums.length ; i++){
            List<List<Integer>> new1 = new ArrayList();
            if(i == 0 || nums[i-1] != nums[i]){
                begin = 0;
            }
            int size = res.size();
            for(int j = begin ; j < size ; j++){
                List<Integer> a = new ArrayList<>(res.get(j));
                a.add(nums[i]);
                new1.add(a);
            }
            res.addAll(new1);
begin = size;
        }
        return res;
    }
}