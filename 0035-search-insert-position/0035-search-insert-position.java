class Solution {
    public int searchInsert(int[] nums, int target) {
        int number = 0;
        if (target < nums[0]){
            return 0;
        }

        if (target > nums[nums.length-1]){
            return (nums.length);
        }

        for (int i = 0; i < nums.length; i++){
            if (target == nums[i]){
                return i;
            }
            
            if (target > nums[i] && target < nums[i+1]){
                number = i+1;
            }
            
        }
        return number;
    }
}