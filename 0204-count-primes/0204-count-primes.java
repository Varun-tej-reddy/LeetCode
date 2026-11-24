class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = 1;
        arr[0] = 0;
        arr[1] = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(arr[i] == 1){
                for(int j = i * i; j < n ; j+=i){
                    arr[j] = 0;
                }
            }
            
        }
        int final_count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1) final_count++;
        }
        return final_count;
    }
}

/*
    int final_count = 0;
        for(int i = 2; i < n; i++){
            int count = 0;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i%j == 0){
                    count++;
                    break;
                } 
            }
            if(count == 0) final_count++;
        }
    return final_count;
*/