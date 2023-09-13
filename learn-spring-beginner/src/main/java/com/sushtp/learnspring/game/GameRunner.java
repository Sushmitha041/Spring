package com.sushtp.learnspring.game;

public class GameRunner {
	GamingConsole game;
	public GameRunner(GamingConsole superContra) {
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
