package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {
	AgeChecker ageChecker = new AgeChecker();
	
	@Test
	public void testAgedUserCanPlay() {
		Assert.assertTrue(ageChecker.canPlayGame(19), "Current age is not allowed to play the game");
	}
	
	@Test
	public void testThatTooYongUsersCanNotPlay(){
		Assert.assertFalse(ageChecker.canPlayGame(16), "Current age allowed to play the game");
	}
	
}
