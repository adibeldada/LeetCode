class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
        
        // SAFETY CHECK: If the needle can't fit starting at i, stop.
        if (i + needle.length() > haystack.length()) {
            break; 
        }

       
        boolean matchFound = true;
        for (int j = 0; j < needle.length(); j++) {
            if (haystack.charAt(i + j) != needle.charAt(j)) {
                matchFound = false;
                break;
            }
        }

        if (matchFound == true) {
            return i;
        }
    }

    return -1;
    }
}