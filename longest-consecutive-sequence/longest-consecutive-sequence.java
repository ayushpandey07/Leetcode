class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null) return 0;
        if(nums.length <= 1) return nums.length;
        Set<Integer> set = new HashSet<>();
        for(int n :  nums){
            set.add(n);
        }
        int longest = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
                int curr = n;
                int currStreak = 1;
                while(set.contains(curr+1)){
                    curr++;
                    currStreak++;
                   // System.out.println("asd"+currStreak);
                }
                longest = Math.max(longest, currStreak);
            }
        }
        return longest;
    }
}