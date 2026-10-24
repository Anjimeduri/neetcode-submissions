class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> elementMap = new HashMap<>();
        elementMap.put(nums[0], 0);
        for(int index = 1; index < nums.length; index++ ) {
            int diff = target - nums[index];
            if(elementMap.containsKey(diff)) {
                return new int[] {elementMap.get(diff), index};
            }
            elementMap.put(nums[index], index);
        }
        return null;
    }
}
