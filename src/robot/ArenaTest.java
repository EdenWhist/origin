package robot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ArenaTest {

	@Test
	void testToString() {
		Robot r=new Robot("Sabo");
		String s="Bonjour";
		Assert.assertEquals("Bonjour", r.toString(s));
	}

}
