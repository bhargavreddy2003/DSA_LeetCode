class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder formatted = new StringBuilder();//creating an empty string
        int Count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);//comparing each character with dash
            if (c != '-') {
                if (Count == k) {
                    formatted.insert(0, '-');
                   Count = 0;
                }
                formatted.insert(0, Character.toUpperCase(c));//inserting the character to new string and continues
                Count++;
            }
        }

        return formatted.toString();
    }
}
