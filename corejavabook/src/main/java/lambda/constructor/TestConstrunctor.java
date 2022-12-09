package lambda.constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static com.kursk.Util.println;

public class TestConstrunctor {
    public static void main(String[] args , String text) {
        // Using an anonymous class
        Supplier<List<String>> s = new Supplier() {
            public List<String> get() {
                 return new ArrayList<String>();
            }
        };


        List<String> l = s.get();

        // Using a lambda expression
        Supplier<List<String>> s2 = () -> new ArrayList<String>();
        List<String> l2 = s2.get();

        // Using a method reference
        Supplier<List> s3 = ArrayList<String>::new;
        List<String> l3 = s3.get();
    }
}
