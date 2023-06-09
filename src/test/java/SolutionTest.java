import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void trapTest1() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int output = 6;
        Assert.assertEquals(output, new Solution().trap(height));
    }

    @Test
    public void trapTest2() {
        int[] height = {4, 2, 0, 3, 2, 5};
        int output = 9;
        Assert.assertEquals(output, new Solution().trap(height));
    }

    @Test
    public void trapTest3() {
        int[] height = {4, 2, 3};
        int output = 1;
        Assert.assertEquals(output, new Solution().trap(height));
    }
}
