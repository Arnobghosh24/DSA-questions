class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i==s.lastIndexOf(s.charAt(i))&& i==s.indexOf(s.charAt(i)))
                return(s.charAt(i));
        }
        return('$');
    }
}
