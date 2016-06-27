package per.exercise.lambda;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefTest {

    @Test
    public void testMethodRef() {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");

        names.forEach(System.out::println);
        names.forEach(MethodRefTest::processStatic);

        Consumer<Object> p = s -> process(s);

        names.forEach(p);


    }

    public void process(Object s) {
        Assert.assertTrue("Mahesh".equals(s) || "Suresh".equals(s));
    }

    public static void processStatic(Object s) {
        Assert.assertTrue("Mahesh".equals(s) || "Suresh".equals(s));
    }

}
