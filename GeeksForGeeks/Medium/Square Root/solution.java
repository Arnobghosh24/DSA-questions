class Solution {
    int floorSqrt(int n) {
        // code here
        /*
        double sq=Math.sqrt(n);
        if((sq-(int)sq)==0)
            return((int)sq);
        return((int)Math.floor(sq));*/
        
        int low=1,high=n-1,ans=0;
        if(n<4)
            return(1);
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid==n)
                return(mid);
            if(mid*mid<n){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return(ans);
        
        
    }
}