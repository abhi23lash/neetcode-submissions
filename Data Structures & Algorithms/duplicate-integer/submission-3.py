class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        ## turn the list to hashset
        ## check hash set's length , and compare it w lists return that 
        num_set = set(nums)
        return len(num_set) != len(nums)
        