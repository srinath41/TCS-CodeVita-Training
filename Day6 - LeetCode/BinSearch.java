class Solution {

  public int searchInsert(int[] nums, int target) {
    int i = 0;
    int j = nums.length;
    while (i < j) {
      int m = i + (j - i) / 2;
      if (nums[m] == target) {
        return m;
      } else if (nums[m] < target) {
        i = m + 1;
      } else {
        j = m;
      }
    }
    return i;
  }
}

class BinSearch {

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.searchInsert(new int[] { 1, 3, 4, 5, 7 }, 7));
    System.out.println(s.searchInsert(new int[] { 1, 3, 4, 5, 7 }, 2));
  }
}
