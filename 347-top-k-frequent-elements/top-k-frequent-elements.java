class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int maxfreq=0;
       
     
       PriorityQueue< Map.Entry<Integer, Integer>> pq= new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        HashMap<Integer, Integer> hm= new HashMap<>();
          for(int num:nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry:hm.entrySet()){
            pq.add(entry);
            if(pq.size()>k){ pq.poll();}
        }
        int [] sol= new int [k];
        int i=0;
        while(!pq.isEmpty()){
            sol[i]=pq.poll().getKey();
            i++;
        }
        return sol;

       


    }
}