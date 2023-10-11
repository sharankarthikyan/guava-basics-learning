import com.google.common.base.CharMatcher;

public class CharMatchertest {
  public void run() {
    System.out.println(CharMatcher.DIGIT.retainFrom("Sharan123"));    // only the digits
      System.out.println(CharMatcher.WHITESPACE.trimAndCollapseFrom("     Sharan     Parashar ", ' '));

      // trim whitespace at ends, and replace/collapse whitespace into single spaces
      System.out.println(CharMatcher.JAVA_DIGIT.replaceFrom("Sharan123", "*"));  // star out all digits
      System.out.println(CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom("Sharan123"));

      // eliminate all characters that aren't digits or lowercase
  }
}
