class Solution {
    boolean isPalindrome(String s) {
        // code here
        int high=s.length()-1,low=0;
        while(high>=low){
            if(s.charAt(high)!=s.charAt(low))
                return(false);
            high--;
            low++;
        }
        return(true);
    }
}