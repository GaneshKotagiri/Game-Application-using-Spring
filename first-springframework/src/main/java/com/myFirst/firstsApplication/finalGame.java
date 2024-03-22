package com.myFirst.firstsApplication;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.myFirst.firstsApplication.game.GameRunnable;
import com.myFirst.firstsApplication.game.GamingConsole;
import com.myFirst.firstsApplication.game.MarioGame;
import com.myFirst.firstsApplication.game.PacMan;
import com.myFirst.firstsApplication.game.tictactoe;
record Boot(GamingConsole game1,GamingConsole game2, GamingConsole game3) {};
@Configurable
public class finalGame {
	@Bean
	@Primary
	public GamingConsole newGame() {
		var game=new MarioGame();
		return game;
	}@Bean
	public GamingConsole NewGameTic() {
		var game=new tictactoe();
		return game;
	}@Bean
	public GamingConsole NewGamePac() {
		return new PacMan();
	}@Bean
	public GameRunnable gamerun(GamingConsole game) {
		return new GameRunnable(game);
	}
}
