class Solution {
    public static int gcd(int a, int b){
        if(a == 0) return b;
        else{
            return gcd(b%a, a);
        }
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+str1)) return "";

        int gcd_len = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd_len); 
    }
}