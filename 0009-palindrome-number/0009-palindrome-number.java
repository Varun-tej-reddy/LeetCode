class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x == 0) return true;
        String s = x+"";

        StringBuffer sb = new StringBuffer();

        while(x!=0){
            int a = x%10;
            sb.append(a+"");
            x/=10;
        }
        return sb.toString().equals(s);
    }
}