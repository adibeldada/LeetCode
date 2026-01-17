class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            while (j < n && nums[j] == nums[i]) {
                nums[j] = 333; 
                j++;
            }
        }

        int l = 0;

        Arrays.sort(nums); 

        for (int j = 0; j < n; j++) {
            if (nums[j] != 333) {
                l++;
            }
        }

        return l;
    }
}
