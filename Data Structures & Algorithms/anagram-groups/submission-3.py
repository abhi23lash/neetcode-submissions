class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

  
        seen = {}
        ## separate each word from the list and then sort them and piecing it all together 
        for word in strs : 
            key = '.'.join(sorted(word))
            if key in seen :
                seen[key].append(word)
            else :
                seen[key] = [word ]
        return list(seen.values())

        
                







        
        