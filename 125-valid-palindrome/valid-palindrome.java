class Solution {
    public boolean isPalindrome(String s) {
         
        int len= s.length();
        
        int left=0;
        int right=len-1;
        if(s.length()==1) return true;
       
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;
             if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))  return false;
            
             left++;
             right--;
        }
        return true;
        
    }
}