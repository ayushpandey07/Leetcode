class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if(nums1.length ==0 || nums2.length ==0 || k ==0) return null;
        
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[0]+a[1] - b[0]-b[1]);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0 ;i<nums1.length && i < k ;i++){
            q.add(new int[]{nums1[i] , nums2[0] ,0});
        }
        
        while(k-- >0 && !q.isEmpty()){
            List<Integer> curr = new ArrayList<>();
            curr.add(q.peek()[0]);
            curr.add(q.peek()[1]);
            res.add(curr);
            if(q.peek()[2] >= nums2.length-1){q.poll(); continue;}
            q.add(new int[]{q.peek()[0],nums2[q.peek()[2]+1],q.peek()[2]+1});
            q.poll();
        }
        return res;
    }
}