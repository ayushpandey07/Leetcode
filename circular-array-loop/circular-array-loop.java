class Solution {
    public boolean circularArrayLoop(int[] nums) {
        //0 for not visited
        //1 for currently visting
        //2 for already visited 
        int[] visited = new int[nums.length];
        for(int i = 0 ;i< nums.length ; i++){
            if(visited[i]==0 && dfs(nums,visited,i)) return true;
        }
        
        return false;
    }
    
    private boolean dfs(int[] nums , int[] v , int curr){
        if(v[curr]==1) return true;
        if(v[curr] ==2) return false;
        v[curr] = 1;
        int next = curr + nums[curr];
        next = next % nums.length;
        if(next < 0) next+=nums.length;
        
        //ya to usi point pr aa rha waps loop ek hi number pr , ya fir ek forward and ek backward
        if(next == curr || nums[curr]*nums[next] < 0) {
            v[curr] = 2;
            return false;}
        
        if(dfs(nums,v,next)) return true;
        v[curr] = 2;
        return false;
    }
}