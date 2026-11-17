class Solution {
    int last(int [] arr,int target){
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                if(mid==n-1 || arr[mid+1]!=arr[mid])
                    return(mid);
                low=mid+1;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return(-1);
    }
    int first(int arr[],int target){
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                if(mid==0 || arr[mid-1]!=arr[mid])
                    return(mid);
                high=mid-1;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return(-1);
    }
    int countFreq(int[] arr, int target) {
        // code here
        int f=first(arr,target);
        if(f!=-1){
            return(last(arr,target)-f+1);
        }
        return(0);
    }
}
