package com.sushtp.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sushtp.learnspring.game.GameRunner;
import com.sushtp.learnspring.game.GamingConsole;
import com.sushtp.learnspring.game.MarioGame;
import com.sushtp.learnspring.game.PackMan;
import com.sushtp.learnspring.game.SuperContra;

public class AppGamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfig.class)) {
			context.getBean(GameRunner.class).run();
		}
	}

}
