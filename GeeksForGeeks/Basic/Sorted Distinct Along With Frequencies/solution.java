class Solution {
    public ArrayList<ArrayList<Integer>> freqSorted(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
        int n=arr.length;
        for(int i=0;i<n;i++)
            for(int j=i;j<n;j++)
                if(arr[i]>arr[j]) {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
        for(int i=0;i<n;i++){
            ArrayList<Integer> al = new ArrayList<Integer>(2);
            al.add(arr[i]);
            int temp=0,a=arr[i];
            for(int j=i;i<n;j++,i++)
                if(arr[j]==a)
                    temp++;
                else
                    break;
            i--;
            al.add(temp);
            ans.add(al);
            
        }
        return(ans);
    
    }
}