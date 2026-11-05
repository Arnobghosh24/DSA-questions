class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length,i,j;
        for(i=0,j=k-1;i<n&&j<n;i+=k,j+=k){
            int high=j;
            int low=i;
            while(high>low){
                int t=arr[high];
                arr[high]=arr[low];
                arr[low]=t;
                high--;
                low++;
            }
        }
        if(i!=n){
            int low=j-k+1;
            int high=n-1;
            while(high>low){
                int t=arr[high];
                arr[high]=arr[low];
                arr[low]=t;
                high--;
                low++;
            }
        }
        /*printing 
        for(int i1=0;i1<n;i1++)
            System.out.print(arr[i1]+"\t");*/
    }
}