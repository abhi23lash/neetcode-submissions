class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> res = new HashMap<>();


        for (int i=0 ; i < numbers.length ; i++){
        int s = numbers[i];
        int diff = target - s ;

        if (res.containsKey(diff)){
          return new int[]{ res.get(diff),i+1};

        
        }
        res.put(numbers[i],i+1);

        

    }
    return new int[] {};
}
}
