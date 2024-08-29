class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
         s= s.replaceAll("[^a-zA-Z0-9]", "");
         
        int len= s.length();
        int count=0;
        int left=0;
        int right=len-1;
        if(s.length()==1) return true;
       
        while(left<right){
             if(s.charAt(left)!=s.charAt(right))  count++;
            
             left++;
             right--;
        }
        return (count==0)?true:false;
        
    }
}