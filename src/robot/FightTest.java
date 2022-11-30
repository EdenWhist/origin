package robot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FightTest {

	@Test
	void testFightRobotRobot() {
		Robot D2R2=new Robot("D2R2");
		Robot Data=new Robot("Data");
		Arena r=new Arena();
		r.fight(Data, D2R2);
		Assert.assertTrue(D2R2.live==0 || Data.live==0);
	}

	@Test
	void testFightFighterFighter() {
		Fighter f1=new Fighter("Ryu");
		Fighter f2=new Fighter("Ken");
		Arena r=new Arena();
		r.fight(f1, f2);
		Assert.assertTrue(f1.live==0 || f2.live==0);
	}

}
