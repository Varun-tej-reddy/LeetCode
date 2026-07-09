class Solution {
    public int majorityElement(int[] nums) {
        int ele = 0, c = 0, c1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(c == 0){
                ele = nums[i];
                c++;
            }
            else if(c > 0 && ele != nums[i])c--;
            else c++;
        }
        for(int i : nums){
            if(i == ele)c1++;
        }
        return c1 > nums.length/2 ? ele : -1; 
    }

}