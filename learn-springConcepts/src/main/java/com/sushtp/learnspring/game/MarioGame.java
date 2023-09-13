package com.sushtp.learnspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");	
		
	}

	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Hide");
	}
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Break");
	}
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Speed");
	}
	
}
