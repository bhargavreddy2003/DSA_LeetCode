class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int water=0;
        int checkwater=0;
        while(l<r){
            if(height[l]==height[r]){
                water=((r-l)*height[r]);
                l++;
            }
              else if(height[l]<height[r]){
                water=((r-l)*height[l]);
                l++;
              }
              else if(height[l]>height[r]){
                water=((r-l)*height[r]);
                r--;
              }
              checkwater=Math.max(checkwater, water);
              
        }
        return checkwater;

    }
}