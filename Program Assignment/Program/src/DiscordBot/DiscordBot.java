package DiscordBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class DiscordBot {
	public static String prefix = "+";
	
	public static void main(String[] args) throws LoginException {
		JDA jda= JDABuilder.createDefault("OTkwNzc0MzM4MDQ1MjM5MzM2.GhnJMc.Rbe8Bcf64bVbGoc6LqEq-K-6bV-OS5XPH7nXQU")
				.setStatus(OnlineStatus.IDLE)
				.setActivity(Activity.watching("you"))
				.addEventListeners(new Commands())
				.build();
		
	}
	
}
