class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        
        Arrays.sort(arr);
       int count=1,max=0;
       for(int i=1;i<arr.length;i++){
           if(arr[i]==arr[i-1]+1) count++;
           else if(arr[i]==arr[i-1]) continue;
           else{
               max=Math.max(count,max);
               count=1;
           }
       }
       max=Math.max(count,max);
       return max;
    }}
