class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()){
        return false;
      }

       //sort s
       char [] sSort = s.toCharArray();

       //sort t 
        char [] tSort = t.toCharArray();
       // compare if equal  
       Arrays.sort(sSort);
       Arrays.sort(tSort);

       return Arrays.equals(sSort,tSort);
    
    }
}
