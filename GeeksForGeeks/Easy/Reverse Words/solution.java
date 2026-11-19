class Solution {
    public String reverseWords(String s) {
        // Code here
        StringBuilder sb=new StringBuilder();
        int end=s.length()-1;
        while(end>=0){
            while(end>=0 && s.charAt(end)=='.')
                end--;
            if(end<0)
                break;
            int start=end;
            while(start>=0 && s.charAt(start)!='.')
                start--;
            if(sb.length()>0)
                sb.append('.');
            sb.append(s,start+1,end+1);
            end=start;
        }
        return(sb.toString());
    }
}
