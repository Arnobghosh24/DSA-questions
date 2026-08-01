class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length,ans=0,sum=0;
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>(n);
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-goal))
                ans+=map.get(sum-goal);            
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return(ans);
    }
}