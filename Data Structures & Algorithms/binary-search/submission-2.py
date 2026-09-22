class Solution:
    def search(self, nums: List[int], target: int) -> int:
     ## sorted  -- twopointer approach 
     ## [] int , paramater target , search for target in array  and return index , if not found return -1 
     #3 must run in o(logn) , cant iterate every single one by one , that'd be o(n) run time 


     l , r = 0, len(nums) -1 
     while l <= r :

        mid = (l + r ) // 2 
        if nums[mid] == target :
            return mid 
        

        elif nums[mid] > target :
            r = mid -1 
        
        else :
            l = mid + 1 
        












     return -1