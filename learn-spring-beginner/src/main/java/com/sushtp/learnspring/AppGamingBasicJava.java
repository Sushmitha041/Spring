package com.sushtp.learnspring;

import com.sushtp.learnspring.game.GameRunner;
import com.sushtp.learnspring.game.MarioGame;
import com.sushtp.learnspring.game.PackMan;
import com.sushtp.learnspring.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game = new SuperContra();
		var game = new PackMan();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
