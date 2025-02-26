package strings;

/**
 * Alphabetical order is a system whereby character strings are placed in order based on the
 * position of the characters in the conventional ordering of an alphabet. Wikipedia:
 * https://en.wikipedia.org/wiki/Alphabetical_order
 */
class Alphabetical {

  public static void main(String[] args) {
    assert !isAlphabetical("123abc");
    assert isAlphabetical("aBC");
    assert isAlphabetical("abc");
    assert !isAlphabetical("xyzabc");
    assert isAlphabetical("abcxyz");
  }

  /**
   * Check if a string is alphabetical order or not
   *
   * 思路就是遍历一遍字符串，相邻的两个字符串如果前者大于后者的ascill那一定不符合字母表顺序
   * @param s a string
   * @return {@code true} if given string is alphabetical order, otherwise {@code false}
   */
  public static boolean isAlphabetical(String s) {
    s = s.toLowerCase();
    for (int i = 0; i < s.length() - 1; ++i) {
      if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i + 1))) {
        return false;
      }
    }
    return true;
  }
}
