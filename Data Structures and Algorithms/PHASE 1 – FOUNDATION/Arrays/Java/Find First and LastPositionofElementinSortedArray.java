class Solution {
    public int[] searchRange(int[] nums, int target) {
        int numsLength = nums.length;
        int left = 0;
        int right = numsLength - 1;
        int flag = -1;
        int[] res = new int[2];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                flag = mid;
                break;
            }
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        if (flag == -1) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        left = 0;
        right = flag;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) right = mid - 1;
            else left = mid + 1;
        }
        res[0] = left;
        right = numsLength - 1;
        left = flag;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) left = mid + 1;
            else right = mid - 1;
        }
        res[1] = right;
        return res;
    }
}