class Solution {
    public static int maxEvenOdd(int arr[]) {
        //  code here
        int n=arr.length,res=1,cur=1;
        int next=(arr[0]%2==0)?1:0;
        for(int i=1;i<n;i++){
            if(arr[i]%2==next){
                cur++;
                res=Math.max(res,cur);
                next=(next==1)?0:1;
            }
            else
                cur=1;
        }
        return(res);
    }
}