import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BiMapTest {
  public void run() {
    BiMap<Integer, String> empIDNameMap = HashBiMap.create();

      empIDNameMap.put(101, "Sharan");
      empIDNameMap.put(102, "Sohan");
      empIDNameMap.put(103, "Ramesh");

      //Emp Id of Employee "Sharan"
      System.out.println(empIDNameMap.inverse().get("Sharan"));
  }
}
