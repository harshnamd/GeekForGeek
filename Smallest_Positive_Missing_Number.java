class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++){
            
            if(arr[i] < 0) arr[i] = 0;        
            
            max = Math.max(max,arr[i]);
        }
        int[] freq = new int[max+1];
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                freq[arr[i]-1] ++;
            }
        }
        for(int i=0; i<max+1; i++){
            if(freq[i] == 0) return i+1;
        }
        return max+1;
    }
}
