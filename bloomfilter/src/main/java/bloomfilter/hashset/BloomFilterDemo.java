package bloomfilter.hashset;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class BloomFilterDemo {
    static final long total = 100_000_000;
    static BloomFilter<String> blackListedIps ;

    static BloomFilter<String> pushList(BloomFilter<String> list) {
        for (int i = 0; i < total; i++) {
            list.put("10.255.255." + i);
        }
        return list;
    }

  public static void main(String[] args) {
    //
      blackListedIps = pushList(BloomFilter.create(Funnels.stringFunnel(Charset.forName("UTF-8")),total));
      long start = System.nanoTime();
      System.out.println(blackListedIps.mightContain("10.255.255.100"));
      long elapsed = System.nanoTime() - start;
      System.out.println("elapsed in nanos: " + elapsed);

      for(;;) { }
    }

    /*
total                       |  JVM used heap size  |  elapsed in nanos
100_000L             |    12M      |
1_000_000L         | 49.6M     |
10_000_000L      |  60.5M     |
100_000_000L    | 103.5M   |
*/
}
