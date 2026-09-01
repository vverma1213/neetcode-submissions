class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int[] output = new int[n];
        int zeroCount = 0;
        long total = 1L;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                total *= num;
            }
        }
        if (zeroCount > 1) {
            // all zeros already in output
            return output;
        }
        if (zeroCount == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) 
                  output[i] = (int) total;
                else 
                  output[i] = 0;
            }
            return output;
        }
        // no zeros
        for (int i = 0; i < n; i++) {
            output[i] = (int) (total / nums[i]);
        }
        return output;

    }
}  
