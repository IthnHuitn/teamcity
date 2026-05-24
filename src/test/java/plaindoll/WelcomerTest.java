package plaindoll;

import static org.junit.Assert.*;
import org.junit.Test;

public class WelcomerTest {
	
	@Test
	public void welcomerSaysWelcome() {
		Welcomer welcomer = new Welcomer();
		assertTrue(welcomer.sayWelcome().contains("Welcome"));
	}
	
	@Test
	public void welcomerSaysFarewell() {
		Welcomer welcomer = new Welcomer();
		assertTrue(welcomer.sayFarewell().contains("Farewell"));
	}
	
	@Test
	public void welcomerSaysNeedGold() {
		Welcomer welcomer = new Welcomer();
		assertTrue(welcomer.sayNeedGold().contains("gold"));
	}
	
	@Test
	public void welcomerSaysSome() {
		Welcomer welcomer = new Welcomer();
		assertTrue(welcomer.saySome().contains("something"));
	}
	
	// ⭐ НОВЫЙ ТЕСТ
	@Test
	public void testGetHunterReplyContainsHunter() {
		Welcomer welcomer = new Welcomer();
		String reply = welcomer.getHunterReply();
		assertTrue("Reply should contain 'hunter' but was: " + reply, 
		           reply.toLowerCase().contains("hunter"));
	}
}