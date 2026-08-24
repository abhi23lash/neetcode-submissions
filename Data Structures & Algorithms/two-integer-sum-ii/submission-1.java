class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0 ;
        int r = numbers.length -1 ; 

        while (left < r){
        int sum = numbers[left] +numbers[r]  ;

         if ( sum == target){
          return new int[]{left + 1,r + 1};
          
         } else if (sum < target){
          left++ ;
          }
          else {
            r -- ;
          }

        }
        return new int []{};
    }
}
