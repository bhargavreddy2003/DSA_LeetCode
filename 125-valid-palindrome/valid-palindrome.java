class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
         String a= s.replaceAll("[^a-zA-Z0-9]", "");
         
        int len= a.length();
        int count=0;
        int left=0;
        int right=len-1;
        if(s.length()==1) return true;
       
        while(left<right){
             if(a.charAt(left)!=a.charAt(right))  count++;
            
             left++;
             right--;
        }
        return (count==0)?true:false;
        
    }
}