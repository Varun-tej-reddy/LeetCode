class Solution {
    public int maxDigitRange(int[] nums) {
        if(nums.length == 1) return nums[0];
        int mat[][] = new int[nums.length][4];
        for(int i = 0; i < nums.length; i++){
            String val = nums[i]+"";
            char[] arr = val.toCharArray();
            Arrays.sort(arr);
            
            mat[i][0] = nums[i];
            mat[i][1] = arr[arr.length -1] - '0';
            mat[i][2] = arr[0] - '0';
            mat[i][3] = mat[i][1] - mat[i][2];
            
        }
        
        Arrays.sort(mat, (a,b)->{
            return Integer.compare(b[3], a[3]);
        });
        int max = mat[0][3];
        int val = mat[0][0];
        for(int i = 1; i < mat.length; i++){
            if(mat[i][3] == max)val+=mat[i][0];
        }

        return val;
        
    }
}