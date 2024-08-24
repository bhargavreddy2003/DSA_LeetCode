class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }

        int longestStreak = 1;
        int currentStreak = 1;
        int prev = pq.poll();

        while (!pq.isEmpty()) {
            int curr = pq.poll();

           
            if (curr == prev) {
                continue;
            }

            if (curr == prev + 1) {
               
                currentStreak++;
            } else {
                
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1; 
            }

            prev = curr;
        }

       
        return Math.max(longestStreak, currentStreak);
    }
}