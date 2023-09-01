class Solution {
    public int romanToInt(String s) {
        int integer = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int value = getValue(ch);

            if (value > prevValue) {
                integer -= prevValue; 
            } else {
                integer += prevValue; 
            }

            prevValue = value;
        }

        integer += prevValue; 
        return integer;
    }

    public int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
