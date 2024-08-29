class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

List<List<Integer>> solList= new ArrayList<>();


int sum=0;
Arrays.sort(nums);
int j=0;
for( int l=0; l<nums.length-2; l++){
    if(l>0 && nums[l]==nums[l-1]) continue;
    int r= nums.length-1;
    int i=l+1;

    while(i<r){
        sum= nums[l]+nums[i]+nums[r];
        if(sum==0){
            List<Integer> temp= new ArrayList<>();
            temp.add(nums[l]);
            temp.add(nums[i]);
            temp.add(nums[r]);
            solList.add(temp);
            i++;
            r--;
            while(i<r && nums[i]==nums[i-1]) i++;
            while(i<r && nums[r]==nums[r+1]) r--;

        }

        if(sum<0) {
            i++;
        }
        if(sum>0){ r--; }

    }
}
    return solList;





}


}