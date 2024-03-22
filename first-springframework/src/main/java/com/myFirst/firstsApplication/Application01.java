package com.myFirst.firstsApplication;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myFirst.firstsApplication.game.GameRunnable;
import com.myFirst.firstsApplication.game.GamingConsole;
import com.myFirst.firstsApplication.game.tictactoe;

public class Application01 {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(finalGame.class)){
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(GameRunnable.class).run();
		}
		
	}
}
