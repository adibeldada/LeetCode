class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder a = new StringBuilder();
        int b = strs[0].length();
       
        
        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() < b){
                b = strs[i].length();
            }
        }

      
        for (int j = 0; j < b; j++){
            int k;
    
            for (k = 1; k < strs.length; k++){
                if (strs[0].charAt(j) != strs[k].charAt(j)){
                    break;
                }
            }
            if (k == strs.length){
                a.append(strs[0].charAt(j));
            } else {

                break;
            }
        }     
        
        String output = a.toString();
        return output;
    }
}