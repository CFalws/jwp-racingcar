package racingcar.domain;

import static racingcar.domain.CarFactory.*;

import racingcar.domain.strategy.MovingStrategy;
import racingcar.domain.strategy.RandomMovingStrategy;

public class RacingGame {
	Cars cars;
	MovingStrategy strategy;

	public RacingGame(String carNames) {
		cars = new Cars(arrangeCars(carNames));
		this.strategy = new RandomMovingStrategy(new RandomNumberGenerator());
	}

	public Cars moveCars() {
		cars.moveCars(strategy);
		return cars;
	}

	public Cars getCars() {
		return cars;
	}
}