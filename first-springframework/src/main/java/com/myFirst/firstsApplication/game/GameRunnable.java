package com.myFirst.firstsApplication.game;

public class GameRunnable {
	GamingConsole game;

	public GameRunnable(GamingConsole game) {
		
		this.game=game;
	}
	public void run() {
		System.out.println("this is a new game: ");
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
