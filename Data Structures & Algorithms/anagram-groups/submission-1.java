class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for ( String s : strs){

            char [] charArray = s.toCharArray(); // turns into a array of characters
            Arrays.sort(charArray);
            // make this single characters back into a string 
            String sortedArray = new String(charArray);

            // if seen a new id , create it w a new list 
            res.putIfAbsent(sortedArray , new ArrayList<>()) ;
            
            // gets the original associated with the id and gets added to the list
            res.get(sortedArray).add(s);




        }
        return new ArrayList<>(res.values());
    }
}
