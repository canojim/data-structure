package per.exercise.lambda;

import org.testng.annotations.Test;
import org.testng.Assert;

public class LambdaTest {

    @Test
    public void testLambda() {
        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        Assert.assertEquals(10 + 5, addition.operation(10, 5));

        Assert.assertEquals(10 + 5, operate(10, 5, addition));
        Assert.assertEquals(10 - 5, operate(10, 5, subtraction));
        Assert.assertEquals(10 * 5, operate(10, 5, multiplication));
        Assert.assertEquals(10 / 5, operate(10, 5, division));

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
