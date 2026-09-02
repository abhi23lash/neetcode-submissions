class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        seen = {}

        for num in nums :
           
                seen[num] = seen.get(num,0) + 1 
        sorted_items = sorted(seen.items(),key = lambda x:x[1], reverse = True)
        top_k = sorted_items[:k]

        result = []
        for pair in top_k :
            num = pair[0]
            result.append(num)


           
        return  result
        