package tests.category;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({PerformanceTests.class,RegressionTests.class})
public class ClassB {

    @Test
    public void testClassB(){
        System.out.println("Performance and Regression ClassB");
        Assert.assertTrue(true);
    }
}
