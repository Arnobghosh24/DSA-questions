class Solution {
    public int mean(int[] arr) {
        // code here
        int n=arr.length;
        if(n==0)
            return(0);
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        return(sum/n);
    }

    public int median(int[] arr) {
        // code here
        int n=arr.length;
        if(n==0)
            return(0);
        Arrays.sort(arr);
        if(n%2==0){
            return((arr[n/2]+arr[(n/2)-1])/2);
        }
        else
        return(arr[n/2]);
        
    }
}