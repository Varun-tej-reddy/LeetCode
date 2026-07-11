class Solution {
    public int longestOnes(int[] nums, int k) {
        int z = 0;
        int max = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++){
            if(nums[right] == 0) {
                z++;
            }
            if(z > k){
                if(nums[left] == 0)z--;
                left++;
            }
            if(z <= k)
                max = Math.max(max, right - left +1);
        }

        return max;
    }
}