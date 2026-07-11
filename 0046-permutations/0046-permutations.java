class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        per(nums, list, 0);
        return list;
    }
    
    public static void per(int[] nums, List<List<Integer>> list, int ind){
        if(ind == nums.length){
            List<Integer> l = new ArrayList<>();
            for(int i : nums)l.add(i);
            list.add(new ArrayList(l));
            return;
        }

        for(int i = ind; i < nums.length; i++){
            swap(nums,i,ind);
            per(nums, list, ind+1);
            swap(nums, i, ind);
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}