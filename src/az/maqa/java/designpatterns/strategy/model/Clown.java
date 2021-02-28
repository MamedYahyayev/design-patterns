package az.maqa.java.designpatterns.strategy.model;

import az.maqa.java.designpatterns.strategy.controller.ScoreAlghorithmBase;

public class Clown extends ScoreAlghorithmBase {

	@Override
	public int calculateScore(int taps, int multiplier) {
		return (taps * multiplier) - 10;
	}


}
