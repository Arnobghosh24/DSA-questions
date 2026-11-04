class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n=arr.length;
        int max=max_aa(arr);
        if(max<0)
            return(max);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            arr[i]=-arr[i];
        }
        int max2=sum+max_aa(arr);
        return(Math.max(max,max2));
            
    }
    int max_aa(int arr[]){
        int n=arr.length;
        int max[]=new int [n];
        int res=arr[0];
        max[0]=arr[0];
        for(int i=1;i<n;i++){
            max[i]=Math.max(max[i-1]+arr[i],arr[i]);
            if(res<max[i])
                res=max[i];
        }
        return(res);
    }
}
