class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int n=arr.length,s=0,cur=0;
        ArrayList<Integer> ans= new ArrayList<Integer>(2);
        for(int e=0;e<n;e++){
            cur+=arr[e];
            while(cur>target && s<e){
                cur-=arr[s];
                s++;
            }
            if(cur==target){
                ans.add(s+1);
                ans.add(e+1);
                return(ans);

            }
        }
        ans.add(-1);
        return(ans);
    }
}
