package az.maqa.java.designpatterns.command.main;

import az.maqa.java.designpatterns.command.controller.Command;
import az.maqa.java.designpatterns.command.model.GameBoy;
import az.maqa.java.designpatterns.command.model.MarioCharacterReceiver;
import az.maqa.java.designpatterns.command.model.MarioUpCommand;

public class Main {

	public static void main(String[] args) {
		MarioCharacterReceiver mario = new MarioCharacterReceiver();
		mario.setName("Mario");

		Command upCommand = new MarioUpCommand(mario);
		Command downCommand = new MarioUpCommand(mario);

		GameBoy game = new GameBoy(upCommand, downCommand, null, null);
		game.arrowLeft();

	}

}
