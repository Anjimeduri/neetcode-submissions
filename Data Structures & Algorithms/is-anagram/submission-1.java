class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sChars = new int[26];
        int[] tChars = new int[26];
        for(char sc: s.toCharArray()) {
            sChars[sc - 'a']++;
        }
        for(char tc: t.toCharArray()) {
            tChars[tc - 'a']++;
        }

        StringBuilder ssb = new StringBuilder();
        for(int sFreq: sChars) {
            ssb.append("#").append(sFreq);
        }
        StringBuilder tsb = new StringBuilder();
        for(int tFreq: tChars) {
            tsb.append("#").append(tFreq);
        }
        return ssb.toString().equals(tsb.toString());
    }
}
