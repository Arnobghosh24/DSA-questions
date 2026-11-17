class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n=arr.length;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-1;j++)
                if(arr[j+1]<arr[j]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
        for(int i=0;i<n-2;i++){
            int low=i+1,high=n-1,tt=target-arr[i];
            while(high>low){
                int mid=(arr[high]+arr[low]);
                if(mid==tt)
                    return true;
                else if(mid>tt)
                    high--;
                else
                    low++;
            }
        }
        return false;
    }
}
