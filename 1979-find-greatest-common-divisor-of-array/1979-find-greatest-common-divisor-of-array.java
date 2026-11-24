class Solution {
    public static int gcd(int a, int b){
        if(a == 0) return b;
        else{
            return gcd(b%a, a);
        }
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return gcd(min,max);
    }
}