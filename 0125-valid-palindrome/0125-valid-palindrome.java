import java.util.Stack;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        Stack<Character> stack = new Stack<>();
        int k = 0;
        String cleaned = "";
        int start = 0;
     

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
                cleaned += c;
            }

        }

        int mid = cleaned.length() / 2;

        for (int i = 0; i < cleaned.length()/2; i++){
            stack.push(cleaned.charAt(i));
        }

        if (cleaned.length() % 2 == 0) {
            start = mid;
        } else {
            start = mid + 1;
        }
       

        for ( int j = start ; j < cleaned.length(); j++){
                if (cleaned.charAt(j) == stack.pop()){
                    continue;
                } else {
                    return false;
                }
        }
        
        return true;

    }
}
