package plaindoll;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class WelcomerTest {
	
	@Test
	public void welcomerSaysWelcome() {
		Welcomer welcomer = new Welcomer();
		assertThat(welcomer.sayWelcome(), containsString("Welcome"));
	}
	
	@Test
	public void welcomerSaysFarewell() {
		Welcomer welcomer = new Welcomer();
		assertThat(welcomer.sayFarewell(), containsString("Farewell"));
	}
	
	@Test
	public void welcomerSaysNeedGold() {
		Welcomer welcomer = new Welcomer();
		assertThat(welcomer.sayNeedGold(), containsString("gold"));
	}
	
	@Test
	public void welcomerSaysSome() {
		Welcomer welcomer = new Welcomer();
		assertThat(welcomer.saySome(), containsString("something"));
	}
	
	@Test
	public void testGetHunterReplyContainsHunter() {
		Welcomer welcomer = new Welcomer();
		String reply = welcomer.getHunterReply();
		assertThat(reply.toLowerCase(), containsString("hunter"));
	}
}