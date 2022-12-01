package robot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RobotTest {

	@Test
	void testFire() {
		Robot r=new Robot("Ron");
		Robot t=new Robot("Ben");
		t.fire(r);
		Assert.assertTrue(r.Live()==8);
		
	}

	@Test
	void testToString() {
		Robot r=new Robot("ace");
		String s="Hello Guys";
		Assert.assertEquals("Hello Guys", r.toString(s));
	}
	

}
