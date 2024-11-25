 class Solution {
    int maxProduct(int[] arr) {
        int lr=1;
        int rl=1;
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            lr*=arr[i];
            max=Math.max(max, lr);
            if(arr[i]==0)lr=1;
        }
        
        for(int i=n-1;i>=0;i--){
             rl*=arr[i];
             max=Math.max(max, rl);
             if(arr[i]==0)rl=1;
        }
        
        return max;
    }
}
