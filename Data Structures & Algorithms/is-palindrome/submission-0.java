class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int i = 0, l = s.length() - 1;
        boolean isTrue = true;

        for(; i < l; i++, l--){
            if(s.charAt(i) != s.charAt(l)){
                isTrue = false;
                break;
            }
        }

        return isTrue;
    }
}
