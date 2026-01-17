class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        int l = 0;

        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            Integer val = it.next();
            nums[l] = val;
            l++;
        }

        for (int j = l; j < nums.length; j++){
            nums[j] = '_';
        }
       
        return l;
    }
}
