class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end =nums.length-1;
        int result = binarysearch(nums,start,end,target);
        return result;
    }
    private int binarysearch(int[] a,int l, int r,int x){
        while (l <= r){
            
            int m = (l + r) / 2;


            if (a[m] == x) {
                return m;
            }
            else if (a[m] > x) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }

        return -1;
    }
}