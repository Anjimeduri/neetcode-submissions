class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int left = 0;
        // int right = nums.length - 1;
        // while(left <= right) {
        //     int sum = nums[left] + nums[right];
        //     if(target == sum) {
        //         return new int[]{left, right};
        //     }else if(sum < target) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }
        // return new int[] {-1, -1};

        HashMap<Integer, Integer> map = 
            new HashMap<>();
        
        for(int i=0; i< nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
