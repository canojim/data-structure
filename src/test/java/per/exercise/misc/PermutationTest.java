package per.exercise.misc;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationTest {

    @Test
    public void testPermutation() {
        //Write a method to compute all permutations of a string
        List<String> p = permutation("abc");

        Assert.assertEquals(6, p.size());

        Set<String> ps = new HashSet<>(p);

        Assert.assertTrue(ps.contains("abc"));
        Assert.assertTrue(ps.contains("acb"));

        Assert.assertTrue(ps.contains("bac"));
        Assert.assertTrue(ps.contains("bca"));

        Assert.assertTrue(ps.contains("cab"));
        Assert.assertTrue(ps.contains("cba"));

    }

    public List<String> permutation(String s) {
        List<String> p = new ArrayList<String>();
        permutation(p, "", s);

        return p;
    }

    private void permutation(List<String> p, String prefix, String s) {

        System.out.println("prefix: " + prefix + " s: " + s);
        int len = s.length();

        if (len == 0) {
            p.add(prefix);
        } else {
            for (int i=0; i < s.length(); i++) {
                permutation(p, prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1));
            }
        }
    }
 }
