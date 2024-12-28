class Solution:
    def findTriplets(self, arr):
        # Your code here
        res = []
        for i in range(len(arr)-2):
            rem = 0 - arr[i]
            d = {}
            for j in range(i + 1, len(arr)):
                two_sum_rem = rem - arr[j]
                for ind in d.get(two_sum_rem, []):
                    res.append([i, ind, j])
                d[arr[j]] = d.get(arr[j], [])
                d[arr[j]].append(j)
        return res
