package plaindoll;

public class Welcomer{
	// Если хочешь больше веселья и информации про ДевОпс - приходи в мои каналы NotOps (telegram, YT, Boosty, Patreon)
	// https://t.me/notopsofficial
	public String sayWelcome() {
		return "Welcome home, good hunter. What is it your desire?";
	}
	public String sayFarewell() {
		return "Farewell, good hunter. May you find your worth in waking world.";
	}
	public String sayNeedGold(){
		return "Not enough gold";
	}
	public String saySome(){
		return "something in the way";
	}
	
	public String getHunterReply() {
		String[] replies = {
			"Welcome, hunter! The hunt begins.",
			"Ah, a skilled hunter has arrived!",
			"Hunter, your prey awaits in the shadows.",
			"A true hunter never rests. Ready for the challenge?",
			"The wilds call for a hunter like you, hunter.",
			"Hunter! Your reputation precedes you."
		};
		int randomIndex = (int)(Math.random() * replies.length);
		return replies[randomIndex];
	}
}