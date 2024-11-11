class Solution {

  public boolean isPalindrome(int x) {
    int n = x;
    int rev = 0;
    if (x < 0) {
      return false;
    }
    while (n > 0) {
      int r = n % 10;
      rev = rev * 10 + r;
      n = n / 10;
    }
    System.out.println(rev);
    return x == rev;
  }
}

class palimdrome {

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.isPalindrome(12321));
  }
}
