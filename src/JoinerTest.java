import java.util.Arrays;

import com.google.common.base.Joiner;

public class JoinerTest {
  public void run() {
      System.out.println(Joiner.on(",")
         .skipNulls()
         .join(Arrays.asList(1,2,3,4,5,null,6)));
   }
}
