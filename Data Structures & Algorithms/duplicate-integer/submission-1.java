class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> elementCount = new HashMap();
        for(int num: nums) {
            if(elementCount.get(num) != null) {
                return true;
            }
            elementCount.put(num, 1);
        }
        return false;
    }
}