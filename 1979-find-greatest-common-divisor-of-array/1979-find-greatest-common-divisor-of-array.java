class Solution {
    public static int gcd(int a, int b){
        if(a == 0) return b;
        else{
            return gcd(b%a, a);
        }
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
}