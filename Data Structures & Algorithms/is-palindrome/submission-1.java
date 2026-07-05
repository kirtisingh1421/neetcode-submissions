class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            char ch = s.charAt(i);
            char ch1 = s.charAt(j);
            if(!Character.isLetterOrDigit(ch)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch1)){
                j--;
                continue;
            }
            if(Character.toLowerCase(ch) == Character.toLowerCase(ch1)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
