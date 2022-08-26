package tests.category;


import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Categories.class)
//@Categories.IncludeCategory(value = PerformanceTests.class)
//@Categories.IncludeCategory({PerformanceTests.class, RegressionTests.class})
//@Categories.IncludeCategory(RegressionTests.class)

//@Categories.ExcludeCategory(RegressionTests.class)

@Suite.SuiteClasses({ClassA.class, ClassB.class, ClassC.class})
public class CheckCategory {

}
