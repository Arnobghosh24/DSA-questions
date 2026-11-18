class Solution {
    public boolean isSubSeq(String s2, String s1) {
        // code here
        //boolean ans=false;
        int n1=s1.length(),n2=s2.length(),i,j;
        for(i=0,j=0;i<n1&& j<n2;i++)
            if(s1.charAt(i)==s2.charAt(j))
                j++;
        return(j==n2);
    }
};