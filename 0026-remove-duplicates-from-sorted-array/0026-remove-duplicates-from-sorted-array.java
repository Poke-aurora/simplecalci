class Solution {
    public int removeDuplicates(int[] nums) {
        //1 1 2 2 3
       //i j
        int rd=0;
        int n =nums.length;
            for(int i=1;i<n;i++){
                if(nums[rd]!= nums[i]){
                    rd++;
                    nums[rd]=nums[i];
                }
            }
        return rd+1;
    }
}