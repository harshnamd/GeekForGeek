class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        s1 = s1.replaceFirst("^0+", "");
        s2 = s2.replaceFirst("^0+", "");
        
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        
        while(i>=0 || j>=0 || carry>0){
            int cnt = carry;
            
            if(i>=0 && s1.charAt(i)=='1')
                cnt++;
                
            if(j>=0 && s2.charAt(j)=='1')
                cnt++;
                
            sb.append(cnt%2);
            carry = cnt/2;
            
            i--; 
            j--;
        }
        
        sb.reverse();
        
        return sb.toString();
    }
}
