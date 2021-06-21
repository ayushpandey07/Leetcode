class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        for(int i =0 ; i < n-2;i++){
             if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
            int rem = nums[i];
            int l = i+1 , r = n-1;
            while(l < r){
                if(nums[l]+nums[r] + rem== 0){
                    res.add(Arrays.asList(rem,nums[l],nums[r]));
                
                    while(l < r && nums[l] == nums[l+1]){
                        l++;
                    }
                    while(r >l && nums[r] == nums[r-1]){
                        r--;
                    }
                        r--;
                    l++;
                }else if (nums[l]+nums[r]+rem > 0){
                    r--;
                }else{
                    l++;
                }
            }
            }
        }
        return res;
    }
}