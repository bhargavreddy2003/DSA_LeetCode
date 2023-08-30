class Solution {
    public int countSegments(String s) {
        String s1 = s.trim();
        if (s1.isEmpty()) {
            return 0;
        }
        
        int count = 1;  
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ' && i > 0 && s1.charAt(i - 1) != ' ') {
                count++;
            }
        }
        
        return count;
    }
}
