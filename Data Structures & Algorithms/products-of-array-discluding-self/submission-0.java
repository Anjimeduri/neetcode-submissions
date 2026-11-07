class Solution {
    public int[] productExceptSelf(int[] nums) { //[1,2,4,6]
        int n = nums.length;
        int[] pfx = new int[n];
       
        int preProd = 1;
        pfx[0] = preProd;
        
        for(int i = 1; i < n; i++) {
            pfx[i] = pfx[i -1] * nums[i - 1];
        } // [1, 1, 2, 8]
        
        int[] result = new int[n];
        int postproduct = 1;
        for(int j = pfx.length-1; j >= 0; j--) {
            result[j] = postproduct * pfx[j];
            postproduct *= nums[j]; 
        }
        return result;
    }
}  
