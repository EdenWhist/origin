package robot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FighterTest {

	@Test
	void test() {
		Robot r=new Robot("Luffy");
		String s="Salut";
		Assert.assertEquals("Salut", r.toString(s));
	}

}
