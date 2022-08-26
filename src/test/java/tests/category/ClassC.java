package tests.category;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ClassC {

    @Category({PerformanceTests.class,RegressionTests.class})
    @Test
    public void testClassC_a(){
        System.out.println("Performance and Regression ClassC_a");
        Assert.assertTrue(true);
    }

    @Category(RegressionTests.class)
    @Test
    public void testClassC_b(){
        System.out.println("Regression ClassC_b");
        Assert.assertTrue(true);
    }
}
