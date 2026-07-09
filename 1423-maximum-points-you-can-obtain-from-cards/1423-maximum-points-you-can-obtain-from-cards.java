class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        for(int i = 0; i < k; i++){
            left +=cardPoints[i];
        }
        max = Math.max(max, left);

        int r = cardPoints.length-1;
        int right = 0;
        for(int i = k-1; i >=0; i--){
            left-=cardPoints[i];
            right+=cardPoints[r--];

            max = Math.max(max, left+right);
        }
        return max;
    }
}