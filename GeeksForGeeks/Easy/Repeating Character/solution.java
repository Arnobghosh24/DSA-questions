class Solution {
    static int repeatedCharacter(String s) {
        // code here
        int n=s.length();
        for(int i=0;i<n;i++) 
            if(i!=s.lastIndexOf(s.charAt(i)))
                return(i);
        return(-1);
    }
}