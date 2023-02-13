package bloomfilter.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
  static Set<String> backListIPs = new HashSet<String>();
  static final long total = 10_000_000L;

  static Set<String> pushList(Set<String> list) {

    for (int i = 0; i < total; i++) {
      list.add("10.255.255." + i);
    }

    return list;
  }

  public static void main(String[] args) {
    //
    backListIPs = pushList(new HashSet<String>());
    long start = System.nanoTime();
    System.out.println(backListIPs.contains("10.255.255.100"));
    long elapsed = System.nanoTime() - start;
    System.out.println("elapsed in nanos: " + elapsed);

    for (; ; ) {}
  }

/*
total                       |  JVM used heap size  |  elapsed in nanos
100_000L             |    47.7MBytes             | 428500
1_000_000L         |     145MBytes             | 288500
10_000_000L      |     1.2GBytes                |
100_000_000L    |     >4GBytes
*/

}
