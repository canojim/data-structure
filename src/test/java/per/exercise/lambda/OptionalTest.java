package per.exercise.lambda;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest {

    @Test
    public void testOptional() {
        Optional<Layer1> l1 = Optional.ofNullable(new Layer1());

        Consumer<Object> p = s -> process(s);

        l1.ifPresent(p);

    }

    public void process(Object o) {
        System.out.println("ifPresent");
        Assert.assertNotNull(o);
    }

    class Layer1 {
        public Optional<Layer2> layer2;
    }

    class Layer2 {
        private Optional<String> str;

        public Optional<String> getStr() {
            return str;
        }

        public void setStr(Optional<String> str) {
            this.str = str;
        }
    }
}
