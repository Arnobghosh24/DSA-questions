class Solution {
    int search(int[] arr, int key) {
        // code here
        int n=arr.length,d=0;
        for(int i=1;i<n;i++)    
            if(arr[i]<arr[i-1]){
                d=i;
                break;
            }
        if(d!=0){
            if(arr[0]>key){
                int high=n-1;
                int low=d;
                while(high>=low){
                    int mid=(high+low)/2;
                    if(arr[mid]==key)
                        return(mid);
                    else if(arr[mid]>key)
                        high=mid-1;
                    else
                        low=mid+1;
                }
                return(-1);
            }
            else {
                int high=d-1;
                int low=0;
                while(high>=low){
                    int mid=(high+low)/2;
                    if(arr[mid]==key)
                        return(mid);
                    else if(arr[mid]>key)
                        high=mid-1;
                    else
                        low=mid+1;
                }
                return(-1);
            }
        }
        else{
            int high=n-1;
            int low=0;
            while(high>=low){
                int mid=(high+low)/2;
                if(arr[mid]==key)
                    return(mid);
                else if(arr[mid]>key)
                    high=mid-1;
                else
                    low=mid+1;
            }
                return(-1);
        }
        
    }
}