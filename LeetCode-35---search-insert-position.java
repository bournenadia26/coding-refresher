class Solution {
    public int searchInsert(int[] nums, int target) {  
        //day two: java refresher on arrays
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

            if (target < nums[i]) {
                return i;
            }
        }
        return nums.length; //end of list reached
    }
}
