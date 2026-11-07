class Solution {
    public int[] productExceptSelf(int[] nums) { //[1,2,4,6]
        int prod = 1;
        int[] products = new int[nums.length]; // [1, 1, 2, 8]
        for(int i = 0; i < nums.length; i++) {
            products[i] = prod;
            prod *= nums[i];
        }

        prod = 1;
        for(int j = nums.length - 1; j >= 0; j--) { //[1,1,2,8]
            products[j] *= prod;
            prod *= nums[j];
        }
        return products;
    }
}  
