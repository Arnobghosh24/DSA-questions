class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int s=(int)Math.abs(nums[n-1]-nums[0]);
        for(int i=0;i<n-1;i++)
            s=Math.max(s,(int)Math.abs(nums[i]-nums[i+1]));
        return(s);
    }
}