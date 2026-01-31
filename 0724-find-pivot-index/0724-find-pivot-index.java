class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (j != i){
                    if (j >= i){
                        right += nums[j];
                    } else {
                        left += nums[j];
                    }

                }
                
            }
            if (left == right){
                return i;
            } else {
                left = 0;
                right = 0;
            }
        }

        return -1;
        
    }
}