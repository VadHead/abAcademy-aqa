package net.absoft.quadraticequation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {
	
	@Test
	public void noRootsForNegativeDiscriminant(){
		Solution solution = Solution.equationResult(3,-4,2);
        Assert.assertTrue(solution.getDiscriminant() < 0, "Discriminant not negative");
	}
	
	@Test
	public void oneRootForZeroDiscriminant(){
		Solution solution = Solution.equationResult(1,-6,9);
        Assert.assertTrue(solution.getDiscriminant() == 0, "Discriminant not equal to zero");
		Assert.assertEquals(solution.x1, solution.x2,"Roots not equal");
		Assert.assertEquals(solution.x1, 3,"Root value is incorrect");
	}
	
	@Test
	public void twoRootsForPositiveDiscriminant(){
		Solution solution = Solution.equationResult(1,-4,-5);
        Assert.assertTrue(solution.getDiscriminant() > 0, "Discriminant not positive");
		Assert.assertEquals(solution.x1, 5, "First root values is incorrect");
		Assert.assertEquals(solution.x2, -1, "Second root values is incorrect");
	}
	
}
