class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer , Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums1.length];
        for(int n : nums2){
            while(!s.isEmpty() && s.peek() < n){
                map.put(s.pop() , n);
            }
            s.add(n);
        }
        int j =0;
        for(int n : nums1){
            res[j++] = map.getOrDefault(n,-1);
        }
        return res;
    }
}