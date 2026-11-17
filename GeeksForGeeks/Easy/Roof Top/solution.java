class Solution {
    public int maxStep(int[] arr) {
        // code here
        int n=arr.length;
        int max=0,br=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i])
                max=Math.max(max,i-br);
            else
                br=i;
        }
        return(max);
    }
}