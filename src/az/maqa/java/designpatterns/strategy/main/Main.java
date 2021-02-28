package az.maqa.java.designpatterns.strategy.main;

import az.maqa.java.designpatterns.strategy.controller.ScoreBoard;
import az.maqa.java.designpatterns.strategy.model.Balloon;
import az.maqa.java.designpatterns.strategy.model.Clown;
import az.maqa.java.designpatterns.strategy.model.SquareBalloon;

public class Main {

	public static void main(String[] args) {
		ScoreBoard board = new ScoreBoard();

		System.out.print("Balloon Tap Score: ");
		board.scoreAlghorithmBase = new Balloon();
		board.showScore(10, 20);

		System.out.print("Clown Tap Score: ");
		board.scoreAlghorithmBase = new Clown();
		board.showScore(10, 30);

		System.out.print("Square Balloon Tap Score: ");
		board.scoreAlghorithmBase = new SquareBalloon();
		board.showScore(10, 40);

	}

}
