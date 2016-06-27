package per.exercise.lambda;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    @Test
    public void testParallelStream() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        //get count of empty string

        long count = strings.parallelStream().filter(s -> s.isEmpty()).count();
        Assert.assertEquals(2, count);
    }

    @Test
    public void testCollect() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        Assert.assertEquals(5, filtered.size());
    }

    //http://stackoverflow.com/questions/28319064/java-8-best-way-to-transform-a-list-map-or-foreach
    @Test
    public void testMap() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> square = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        Assert.assertEquals(4, square.size());
        Assert.assertEquals(new Integer(9), square.get(0));
    }

    @Test
    public void testSort() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> sorted = numbers.parallelStream().sorted().collect(Collectors.toList());
        Assert.assertEquals(7, sorted.size());
        Assert.assertEquals(new Integer(2), sorted.get(0));
        Assert.assertEquals(new Integer(7), sorted.get(6));
    }
}
