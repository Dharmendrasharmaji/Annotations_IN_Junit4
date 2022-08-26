package tests.category;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ClassA {

    @Category(PerformanceTests.class)
    @Test
    public void testClassA_a(){
        System.out.println("Performance  ClassA_a");
        Assert.assertTrue(true);
    }

    @Test
    public void testClassA_b(){
        System.out.println("normal ClassA_b");
        Assert.assertTrue(true);
    }
}
