class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxResult = 0;
        while(left < right) {
            int minHeight = Math.min(heights[left], heights[right]);//1
            int newResult = minHeight * (right - left);
            maxResult = Math.max(maxResult, newResult);
            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxResult;
    }
}
