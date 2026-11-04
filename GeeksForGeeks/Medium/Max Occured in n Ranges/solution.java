class Solution {
    public int maxOccured(List<Integer> L, List<Integer> R) {
        // code here
        int max=R.get(0),n=R.size();
        for(int i=0;i<n;i++)
            max=Math.max(max,R.get(i));
        int freq[]=new int[max+2];
        for(int i=0;i<n;i++){
            freq[L.get(i)]++;
            freq[R.get(i)+1]--;
        }
        int res=0;
        for(int i=1;i<max+1;i++){
            freq[i]+=freq[i-1];
            if(freq[res]<freq[i])
                res=i;
        }
        return(res);
    }
}
