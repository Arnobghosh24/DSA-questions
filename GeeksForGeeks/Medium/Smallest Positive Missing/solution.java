class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length,max=1;
        for(int i=0;i<n;i++)
            max=Math.max(max,arr[i]);
        boolean all[]=new boolean[max+1];
        Arrays.fill(all,true);
        for(int i=0;i<n;i++)
            if(arr[i]>=1)
                all[arr[i]]=false;
        for(int i=1;i<=max;i++)
            if(all[i])
                return(i);
        return(max+1);
    }
}
