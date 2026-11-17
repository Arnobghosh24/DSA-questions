class Solution {
    public int countOnes(int[] arr) {
        // code here
        int n=arr.length;
        if(arr[n-1]==1)
            return(n);
        if(arr[0]==0)
            return(0);
        int low=0,high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==0){
                if(mid==n-1 || arr[mid-1]==1)
                    return(mid);
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return(0);
    }
}