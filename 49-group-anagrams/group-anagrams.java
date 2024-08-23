class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm= new HashMap<>();
        for( String s: strs){
            char[] chr= s.toCharArray();
           Arrays.sort(chr);
           String sortedchrs= new String(chr);
           if(!hm.containsKey(sortedchrs)){
            hm.put(sortedchrs, new ArrayList<>());
           }
           hm.get(sortedchrs).add(s);
        }
       return new ArrayList<>(hm.values());


    }
}