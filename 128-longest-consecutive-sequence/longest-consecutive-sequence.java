class Solution {
    public int longestConsecutive(int[] nums) {
        int curr;
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> hs= new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
       
        int longcount=1;
        for(int key: hs){
            
            if(!hs.contains(key-1)){
                 curr=key;
                 int count=1;
                 while(hs.contains(curr+1)){
                    curr++;
                    count++;
                 }
                 longcount= Math.max(longcount, count);

            }
            else continue;

            

           
        }
        return longcount;
    }
}