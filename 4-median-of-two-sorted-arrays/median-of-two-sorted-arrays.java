class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();
        double median = 0;

    
        for (int num : nums1) {
            pq.add(num);
        }
      
        for (int num : nums2) {
            pq.add(num);
        }

     
        while (!pq.isEmpty()) {
            al.add(pq.poll());
        }

        int size = al.size();
        int mid = size / 2;

       
        if (size % 2 == 0) {  
            median = ((double) al.get(mid) + (double) al.get(mid - 1)) / 2;
        } else {  
            median = (double) al.get(mid);
        }

        return median;
    }
}