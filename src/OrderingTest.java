import java.util.Collections;
import java.util.List;

import com.google.common.collect.Ordering;

public class OrderingTest {
  public void orderIntegerList(List<Integer> numbers) {
    Ordering ordering = Ordering.natural();
    System.out.println("Input List: ");
    System.out.println(numbers);

    Collections.sort(numbers, ordering);
    System.out.println("Sorted List: ");
    System.out.println(numbers);

    System.out.println("=====================");
    System.out.println("List is sorted: " + ordering.isOrdered(numbers));
    System.out.println("Minimum: " + ordering.min(numbers));
    System.out.println("Maximum: " + ordering.max(numbers));

    Collections.sort(numbers, ordering.reverse());
    System.out.println("Reverse: " + numbers);

    numbers.add(null);
    System.out.println("Null added to Sorted List: ");
    System.out.println(numbers);

    Collections.sort(numbers, ordering.nullsFirst());
    System.out.println("Null first Sorted List: ");
    System.out.println(numbers);
    System.out.println("======================");
  }

  public void orderStringList(List<String> names) {
    Ordering ordering = Ordering.natural();

    System.out.println("Another List: ");
    System.out.println(names);

    Collections.sort(names, ordering.nullsFirst().reverse());
    System.out.println("Null first then reverse sorted list: ");
    System.out.println(names);
  }
}
