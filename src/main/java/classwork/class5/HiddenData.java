package classwork.class5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HiddenData implements Iterable<String> {
  private final List<String> months = Arrays.asList(
      "Jan","Feb","Mar","Apr","May");

  @Override
  public Iterator<String> iterator() {

    Iterator<String> iterator = new Iterator<String>() {

      Random random1 = new Random();
      int index;
      @Override
      public boolean hasNext() {
        return index < months.size();
      }

      @Override
      public String next() {
        index = random1.nextInt(months.size());
        return months.get(index++);
      }
    };
    return iterator;


   /* Iterator<String> randomIterator = new Iterator<String>() {

      Random random1 = new Random(5);
      int index = random1.nextInt();
      @Override
      public boolean hasNext() {
        return index < months.size();
      }

      @Override
      public String next() {
        return months.get(index++);
      }
    }; */

  }
}
