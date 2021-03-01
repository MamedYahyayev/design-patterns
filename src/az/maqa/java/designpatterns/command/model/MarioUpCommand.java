package az.maqa.java.designpatterns.command.model;

import az.maqa.java.designpatterns.command.controller.Command;

public class MarioUpCommand implements Command {

	private final MarioCharacterReceiver receiver;

	public MarioUpCommand(MarioCharacterReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.moveUp();
	}

}
