class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int r = nums.length - 1;

        while(l <= r){
            if(nums[l] == 0){
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                m++;
            } else if(nums[l] == 2){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
                l--;
            }
            l++;
        }
    }
}