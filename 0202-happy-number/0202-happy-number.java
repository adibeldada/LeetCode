class Solution {
    public boolean isHappy(int n) {
        String str = Integer.toString(n);
        int nums[] = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            nums[i] = digit;
        }

        int x = 0;

        for (int j = 0; j < nums.length; j++) {
            x += nums[j] * nums[j];
        }

        if (x == 1) {
            return true;
        }

        if (x == 4) {
            return false;
        }

        return isHappy(x);
    }
}