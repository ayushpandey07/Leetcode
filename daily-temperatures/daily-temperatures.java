class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] stack = new int[n];
        int top = -1;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            while(top != -1 && temperatures[stack[top]] < temperatures[i]){
                int idx = stack[top--];
                res[idx] = i-idx;
            }
            stack[++top] = i;
        }
        return res;
    }
}