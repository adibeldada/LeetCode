class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                l++;
            }
            if (nums[i] == val){
                nums[i] = 100;
            }

            
            
        }

        Arrays.sort(nums);

        return l;
    }
}