class Solution:
    #Complete the below function
    def countPairs(self,arr, target):
        #Your code here
        d = {}
        total_pairs = 0
        for i in arr:
            r = target - i
            total_pairs += d.get(r, 0)
            d[i] = d.get(i, 0) + 1
        return total_pairs
