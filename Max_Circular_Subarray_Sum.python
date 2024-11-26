def circularSubarraySum(arr):
    total_sum = sum(arr)
    max_sum = float('-inf')
    min_sum = float('inf')
    curr_max_sum = 0
    curr_min_sum = 0

    for num in arr:
        curr_max_sum = max(curr_max_sum + num, num)
        max_sum = max(max_sum, curr_max_sum)
        
        curr_min_sum = min(curr_min_sum + num, num)
        min_sum = min(min_sum, curr_min_sum)

    return max(max_sum, total_sum - min_sum)
