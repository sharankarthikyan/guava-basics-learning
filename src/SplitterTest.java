import com.google.common.base.Splitter;

public class SplitterTest {
  public void run() {
     System.out.println(Splitter.on('.')
         .trimResults()
         .omitEmptyStrings()
         .split("the .quick. .brown. fox. jumps. over. the. lazy. little dog."));
  }
}
