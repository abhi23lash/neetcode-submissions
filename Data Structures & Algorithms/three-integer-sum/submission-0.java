class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> abg = new ArrayList<>();
        for (int i =0 ; i< nums.length -2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i +1 ;
            int right = nums.length - 1 ;
            int target = - nums[i];
            while (left < right){
              if (nums[left]+nums[right] < target){
                left ++ ;
              }
              else if (nums[left]+nums[right]  > target){
                right -- ;
              }
              else {
              abg.add(Arrays.asList(nums[left],nums[right],nums[i]));
                while (left < right && nums[left]== nums[left + 1])left ++;
                while (left < right && nums [right ]==nums [right -1]) right -- ;
                left++;
                    right--;
              }
            }
        }
        return abg;
    }

}
