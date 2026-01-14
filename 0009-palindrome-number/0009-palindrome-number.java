class Solution {
    public boolean isPalindrome(int x) {
        String numStr = Integer.toString(x);
        int j = numStr.length() - 1;

        for (int i = 0; i < (numStr.length()/2) ; i++){
            if (numStr.charAt(i) == numStr.charAt(j)){
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}