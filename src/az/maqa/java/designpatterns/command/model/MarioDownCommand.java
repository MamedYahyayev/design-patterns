package az.maqa.java.designpatterns.command.model;

import az.maqa.java.designpatterns.command.controller.Command;

public class MarioDownCommand implements Command {

	private final MarioCharacterReceiver receiver;

	public MarioDownCommand(MarioCharacterReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.moveDown();
	}

}
