class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int s1=arr[0],s2=-1,n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>s1){
                s2=s1;
                s1=arr[i];
            }
            if(arr[i]<s1 && arr[i]>s2)
                s2=arr[i];
        }
        return(s2);
    }
}