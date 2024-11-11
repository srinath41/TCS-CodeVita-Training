// import java.util.HashMap;
import java.util.Map;

class Solution {

  public boolean isValid(String s) {
    StringBuilder sb = new StringBuilder();
    Map<Character, Character> hm = Map.of(')', '(', ']', '[', '}', '{');
    for (char i : s.toCharArray()) {
      if (i == '(' || i == '{' || i == '[') {
        sb.append(i);
      } else {
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == hm.get(i)) {
          sb.deleteCharAt(sb.length() - 1);
        } else {
          return false;
        }
      }
    }
    return sb.length() == 0;
  }
}

class validpara {

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.isValid("()"));
  }
}
