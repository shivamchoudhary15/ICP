class Solution {
    public int maxSubArray(int[] nums) {
        int cmax=0;
        int fmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cmax=cmax+nums[i];
            fmax=Math.max(fmax,cmax);
            if(cmax<0){
                cmax=0;
            }
        }
        return fmax;
    }
}
