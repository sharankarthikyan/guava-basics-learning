import com.google.common.base.Optional;

public class OptionalTest {
  public Integer sum(Optional<Integer> a, Optional<Integer> b) {
      //Optional.isPresent - checks the value is present or not
      System.out.println("First parameter is present: " + a.isPresent());

      System.out.println("Second parameter is present: " + b.isPresent());

      //Optional.or - returns the value if present otherwise returns
      //the default value passed.
      Integer value1 = a.or(new Integer(0));	

      //Optional.get - gets the value, value should be present
      Integer value2 = b.get();

      return value1 + value2;
    }
}
