package per.exercise.lambda;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class WordCountTest {

    @Test
    public void testWordCount() {
        List<String> words = Arrays.asList("test", "map", "reduce", "test", "map", "reduce");

        Consumer p1 = x -> {
            System.out.println("p1 called");
            Assert.assertEquals(6, x);
        };

        words.parallelStream().map(x -> 1)
                .reduce((x, y) -> (x + y))
                .ifPresent(p1);
    }

    class Count {
        private String word;
        private int count;

        public Count(String word, int count) {
            this.word = word;
            this.count = count;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Count{");
            sb.append("word='").append(word).append('\'');
            sb.append(", count=").append(count);
            sb.append('}');
            return sb.toString();
        }
    }
}
