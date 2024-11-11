class Solution {

  public int removeDuplicates(int[] nums) {
    int x = 0;
    for (int y = 1; y < nums.length; y++) {
      if (nums[y] != nums[x]) {
        x++;
        nums[x] = nums[y];
      }
    }
    return x + 1;
  }
}

class rmdup {

  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9, 9 };
    int n = s.removeDuplicates(nums);
    System.out.println(n);
  }
}
