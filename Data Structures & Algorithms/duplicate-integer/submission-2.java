class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> elementCount = new Hashtable();
        for(int num: nums) {
            if(elementCount.get(num) != null) {
                return true;
            }
            elementCount.put(num, 1);
        }
        return false;
    }
}