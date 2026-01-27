class Solution {
    public int singleNumber(int[] nums) {
        int times = 0;
    
        for (int i = 0; i < nums.length; i++){
            times = 0;
            
            for (int j = 0; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    times++;
                } 
                
            }

            if (times != 2){
                    return nums[i];
                }



        }
      return times;
    }
}