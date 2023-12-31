import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Optional;

public class App {
  public static void main(String[] args) throws Exception {
    // Optional class
    System.out.println("======================== OPTIONAL CLASS ========================");
    OptionalTest optionalTester = new OptionalTest();
    Integer value1 = null;
    Integer value2 = new Integer(10);

    // Optional.fromNullable - allows passed parameter to be null.
    Optional<Integer> a = Optional.fromNullable(value1);

    // Optional.of - throws NullPointerException if passed parameter is null
    Optional<Integer> b = Optional.of(value2);
    System.out.println(optionalTester.sum(a, b));

    // Precondition class
    System.out.println("======================== PRECONDITION CLASS ========================");
    PreconditionTest preconditionTester = new PreconditionTest();

    try {
      System.out.println(preconditionTester.sqrt(-3.0));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(preconditionTester.sum(null, 3));
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    }

    try {
      System.out.println(preconditionTester.getValue(6));
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }

    // Ordering class
    System.out.println("======================== ORDERING CLASS ========================");
    OrderingTest orderingTest = new OrderingTest();

    List<Integer> numbers = new ArrayList<Integer>();

    numbers.add(5);
    numbers.add(2);
    numbers.add(15);
    numbers.add(51);
    numbers.add(53);
    numbers.add(35);
    numbers.add(45);
    numbers.add(32);
    numbers.add(43);
    numbers.add(16);

    orderingTest.orderIntegerList(numbers);

    List<String> names = new ArrayList<String>();

    names.add("Ram");
    names.add("Shyam");
    names.add("Mohan");
    names.add("Sohan");
    names.add("Ramesh");
    names.add("Suresh");
    names.add("Naresh");
    names.add("Sharan");
    names.add(null);
    names.add("Vikas");
    names.add("Deepak");

    orderingTest.orderStringList(names);

    // Object class
    System.out.println("======================== OBJECT CLASS ========================");
    ObjectTest objectTest = new ObjectTest();
    objectTest.run();

    // Range class
    System.out.println("======================== RANGE CLASS ========================");
    RangeTest rangeTest = new RangeTest();
    rangeTest.testRange();

    // Throwables class
    System.out.println("======================== THROWABLES CLASS ========================");
    ThrowablesTest throwablesTest = new ThrowablesTest();
    throwablesTest.run();

    // Collection classes
    // Multiset class
    System.out.println("======================== MULTISET CLASS ========================");
    MultiSetTest multiSetTest = new MultiSetTest();
    multiSetTest.run();

    // Multimap class
    System.out.println("======================== MULTIMAP CLASS ========================");
    MultiMapTest multiMapTest = new MultiMapTest();
    multiMapTest.run();

    // BiMap class
    System.out.println("======================== BIMAP CLASS ========================");
    BiMapTest biMapTest = new BiMapTest();
    biMapTest.run();

    // Table class
    System.out.println("======================== TABLE CLASS ========================");
    TableTest tableTest = new TableTest();
    tableTest.run();

    //
    // Collection classes ---- End

    // LoadingCache class
    System.out.println("======================== LOADING CACHE CLASS ========================");
    LoadingCacheTest loadingCacheTest = new LoadingCacheTest();
    loadingCacheTest.run();

    // String classes
    // Joiner class
    System.out.println("======================== JOINER CLASS ========================");
    JoinerTest joinerTest = new JoinerTest();
    joinerTest.run();

    // Splitter class
    System.out.println("======================== SPLITTER CLASS ========================");
    SplitterTest splitterTest = new SplitterTest();
    splitterTest.run();

    // CharMatcher class
    System.out.println("======================== CHAR MATCHER CLASS ========================");
    CharMatchertest charMatchertest = new CharMatchertest();
    charMatchertest.run();

    // CaseFormat class
    System.out.println("======================== CASE FORMAT CLASS ========================");
    CaseFormatTest caseFormatTest = new CaseFormatTest();
    caseFormatTest.run();
    //
    // String classes -- -- End

    // Primitive Utilities
    // Bytes class
    System.out.println("======================== BYTES CLASS ========================");
    BytesTest bytesTest = new BytesTest();
    bytesTest.run();
  }
}
