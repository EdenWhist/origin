package robot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RobotTestTest {

	@Test
	void testTestFire() {
		Robot r=new Robot("Ron");
		Robot t=new Robot("Tork");
		r.live=0;
		t.fire(r);
		Assert.assertTrue(r.live==0);
	}

}
