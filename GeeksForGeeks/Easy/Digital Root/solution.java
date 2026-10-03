class Solution {
    public int digitalRoot(int n) {
        // code here
        if(n<10)
            return(n);
        int a=0;
        while(n>0){
            a+=n%10;
            n/=10;
        }
        return(digitalRoot(a));
    }
};