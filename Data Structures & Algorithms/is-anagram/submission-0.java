class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charFreq = new HashMap<>();
        if(s.length() != t.length()) {
            return false;
        }
        for(int i=0; i< s.length();i++) {
            char c =s.charAt(i);
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        for(int i=0; i< t.length();i++) {
            char c = t.charAt(i);
            if(!charFreq.containsKey(c) || charFreq.get(c) == 0) {
                return false;
            }
            charFreq.put(c, charFreq.get(c) - 1);
        }

        for(Character c: charFreq.keySet()) {
            if(charFreq.get(c) > 0) {
                return false;
            }
        }
        return true; 
    }
}
