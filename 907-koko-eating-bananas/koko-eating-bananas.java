class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i : piles) {
            if (i > max) {
                max= Math.max( max, i);
            }
        }

        int l = 1;
        int r = max;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int timetaken = totalhours(piles, mid);
            
            if (timetaken <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        
        return l;
    }

    public int totalhours(int[] arr, int speed) {
        int time = 0;
        for (int pile : arr) {
            time +=  (int) Math.ceil( (double) pile / speed); 
        }
        return time;
    }
}
