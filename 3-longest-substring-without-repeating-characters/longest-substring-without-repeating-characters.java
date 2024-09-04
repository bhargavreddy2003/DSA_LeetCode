import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        HashSet<Character> hm = new HashSet<>();
        int maxLength = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            while (hm.contains(s.charAt(r))) {
                hm.remove(s.charAt(l));
                l++;
            }
            hm.add(s.charAt(r));
            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
