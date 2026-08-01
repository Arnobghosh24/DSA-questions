class Solution {
    public int majorityElement(int[] arr) {
        int res=0,count=1,n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[res]==arr[i])
                count++;
            else
                count--;
            if(count==0){
                res=i;
                count=1;
            }
        }
        return(arr[res]);
    }
}