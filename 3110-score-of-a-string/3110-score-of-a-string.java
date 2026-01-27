class Solution {
    public int scoreOfString(String s) {
        int number=0;
        for (int i = 0; i <s.length()-1; i++){
            number += Math.abs((int)(s.charAt(i) - s.charAt(i+1)));
        }
        return number;
    }
}