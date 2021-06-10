class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length) return nums;
        Map<Integer , Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n , mp.getOrDefault(n ,0)+1);
        }
        
        Queue<Integer> q = new PriorityQueue<>((n1,n2)->mp.get(n1)-mp.get(n2));
        for(int n : mp.keySet()){
            q.add(n);
            if(q.size()>k) q.poll();
        }
        int[] top = new int[k];
        for(int i = k-1 ;i>=0 ;i--){
            top[i] = q.poll();
        }
        
        return top;
    }
}