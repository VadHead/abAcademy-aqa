package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {
	
	@Test
	public void testAgedUserCanPlay() {
		AgeChecker ageChecker = new AgeChecker();
		Assert.assertTrue(ageChecker.canPlayGame(19), "User's age is lower than required. Unable to play the game.");
	}
	
}
