package com.sushtp.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole superContra) {
		// TODO Auto-generated constructor stub
		this.game = superContra;
		
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running"+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
