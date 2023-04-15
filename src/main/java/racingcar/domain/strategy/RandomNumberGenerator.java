package racingcar.domain.strategy;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumberGenerator implements NumberGenerator {

	private static final int UPPER_BOUND = 10;
	private static final Random random = new Random();

	public int generateInt() {
		return random.nextInt(UPPER_BOUND);
	}
}
