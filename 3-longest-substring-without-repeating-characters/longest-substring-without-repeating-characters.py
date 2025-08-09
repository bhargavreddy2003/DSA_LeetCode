class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        dup = set()
        lft=0
        rgt=1
        
        max_lenght=0
        s_length=len(s)
        if s_length==1:
            return 1
        if s_length==0 :
            return 0
        dup.add(s[0])
        while(rgt<s_length):
            if s[rgt] not in  dup:
                dup.add(s[rgt])
                word_len=rgt-lft+1
                rgt=rgt+1
                max_lenght = max(max_lenght, word_len)
            else:
                dup.discard(s[lft])
                lft=lft+1
           
        return max_lenght


            

           



        