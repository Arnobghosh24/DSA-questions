class Solution {
    public static int findSum(String s) {
        // code here
        int n=s.length(),sum=0;
        for(int i=0;i<n;){
            int t=0;
            char ch=s.charAt(i);
            while(ch<='9' && ch>='0' && i<n){
                t=t*10+((int)s.charAt(i)-'0');
                i++;
                if(i==n)    
                    break;
                ch=s.charAt(i);
            }
            sum+=t;
            if(i==n)
                break;
            
            while((i<n)&&(ch>'9' || ch<'0')){
                i++;
                if(i==n)    
                    break;
                ch=s.charAt(i);
            }
            if(i==n)
                break;
            
        }
        return(sum);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}