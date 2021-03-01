package az.maqa.java.designpatterns.command.model;

import az.maqa.java.designpatterns.command.controller.Command;

public class GameBoy {
	private Command upCommand, downCommand, leftCommand, rightCommand;

	public GameBoy(Command upCommand, Command downCommand, Command leftCommand, Command rightCommand) {
		this.upCommand = upCommand;
		this.downCommand = downCommand;
		this.leftCommand = leftCommand;
		this.rightCommand = rightCommand;
	}

	public void arrowUp() {
		if (upCommand != null) {
			upCommand.execute();
		} else {
			throw new NullPointerException("Up Command cannot be null if you want to move your character !");
		}
	}

	public void arrowDown() {
		if (downCommand != null) {
			downCommand.execute();
		} else {
			throw new NullPointerException("Down Command cannot be null if you want to move your character !");
		}
	}

	public void arrowRight() {
		if (rightCommand != null) {
			rightCommand.execute();
		} else {
			throw new NullPointerException("Right Command cannot be null if you want to move your character !");
		}
	}

	public void arrowLeft() {
		if (leftCommand != null) {
			leftCommand.execute();
		} else {
			throw new NullPointerException("Left Command cannot be null if you want to move your character !");
		}
	}

}
