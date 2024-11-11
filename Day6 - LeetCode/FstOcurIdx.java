class Solution {

  public int strStr(String haystack, String needle) {
    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
      if (haystack.substring(i, i + needle.length()).equals(needle)) {
        return i;
      }
    }
    return -1;
  }
}

class FstOcurIdx {

  public static void main(String[] args) {
    Solution s = new Solution();
    int a = s.strStr("sadbutsad", "sad");
    System.out.println(a);
  }
}
