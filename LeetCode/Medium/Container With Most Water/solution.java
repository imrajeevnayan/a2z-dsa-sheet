class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        
        while (left < right) {
            // Current width and height
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            
            // Calculate area and update max
            maxWater = Math.max(maxWater, h * width);
            
            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}