class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<a.length;i++){
            ts.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            ts.add(b[i]);
        }
        return ts.size();
    }
}
