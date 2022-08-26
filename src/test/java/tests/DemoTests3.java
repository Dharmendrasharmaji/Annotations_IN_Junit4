package tests;

import calculator.Calculator;
import org.junit.*;

public class DemoTests3 {
    private static int beforeClassCount = 0;
    private static int afterClassCount = 0;
    private static int beforeCount = 0;
    private static int afterCount = 0;

    Calculator calc = new Calculator();

    @BeforeClass
    public static void testBeforeClassCount() {
        System.out.println("Initializing the test cases...");
        System.out.println("BeforeClass count " + ++beforeClassCount + "\n");
        System.out.println("---------------------------------------------------------");
    }

    @Before
    public void testBeforeCount() {
        System.out.println("\nBefore every Test case...");
        System.out.println("Before count " + ++beforeCount);
    }

    @Test
    @Ignore
    public void testAddition() {
        Assert.assertNotEquals(2, calc.add(2, 2));
        System.out.println("---------Addition Testing Done---------");
    }

    @Test(timeout = 1500, expected = InterruptedException.class)
    public void testMul() throws InterruptedException {

        Thread.sleep(1000);

        Assert.assertEquals(2, calc.mul(2, 1));
        System.out.println("----------Multiplication Testing Done---------");

        throw new InterruptedException();
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(2, calc.div(2, 1));
        System.out.println("----------Division Testing Done------------");
    }

    @After
    public void testAfterCount() {
        System.out.println("After Every Test case...");
        System.out.println("After count " + ++afterCount + "\n");
    }

    @AfterClass
    public static void testAfterClassCount() {
        System.out.println("---------------------------------------------------------");
        System.out.println("\nTerminating Test cases...");
        System.out.println("AfterClass count " + ++afterClassCount);
    }
}
