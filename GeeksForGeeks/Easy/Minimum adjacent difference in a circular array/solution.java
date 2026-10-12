class Solution {
    public int minAdjDiff(int[] arr) {
        // code here
        int n=arr.length;
        int s=(int)Math.abs(arr[n-1]-arr[0]);
        for(int i=0;i<n-1;i++)
            s=Math.min(s,(int)Math.abs(arr[i]-arr[i+1]));
        return(s);
    }
}
