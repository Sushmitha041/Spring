package com.sushtp.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sushtp.learnspring.game.GameRunner;
import com.sushtp.learnspring.game.GamingConsole;
import com.sushtp.learnspring.game.PackMan;

@Configuration
public class GamingConfig {
	
	@Bean
	public GamingConsole game() {
		return new PackMan();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}

}
