package classwork.class7.dao;

import java.util.function.Supplier;

public class DeepRabbitHole {

  void process(Supplier<Person> supplier) {
    Person person = supplier.get();
  }
}
