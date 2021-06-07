class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        
        int left = 0;
        int right = heights.length - 1;
        
        int maxHeight = 0;
        
        while (left < right) {
            // only worry about the case where the min height between the borders is  greater than we what we had before
            int localMaxHeight = Math.min(heights[left], heights[right]);
            if (localMaxHeight > maxHeight) {
                maxHeight = localMaxHeight;
                maxArea = Math.max(maxArea, maxHeight * (right - left));
            }
            
            // move pointers
            if (heights[left] == heights[right]) {
                left ++;
                right --;
            } else if (heights[left] < heights[right]) {
                left ++;
            } else {
                right --;
            }
        }
        
        return maxArea;

    }
}