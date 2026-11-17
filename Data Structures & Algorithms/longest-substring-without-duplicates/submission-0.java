class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longLength = 0;
        Set<Character> chars = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            while (chars.contains(c)) {
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(c);
            longLength = Math.max(longLength, i - left + 1);
        }
        return longLength;
    }
}
