package az.maqa.java.designpatterns.strategy.controller;

public class ScoreBoard {

	public ScoreAlghorithmBase scoreAlghorithmBase;

	public void showScore(int taps, int multiplier) {
		System.out.println(scoreAlghorithmBase.calculateScore(taps, multiplier));
	}

}
