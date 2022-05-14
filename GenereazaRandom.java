import java.sql.Date;
import java.util.Random;

public class GenereazaRandom {

	private Random generator;

	public GenereazaRandom() {
		Date now = new Date(0);
		long sec = now.getSeconds();
		generator = new Random(sec);
	}

	public int genereazaX() {
		int x = generator.nextInt(101);
		if (x < 5) {
			x = 0;
		} else if (x > 95) {
			x = 100;
		} else {
			x = generator.nextInt(99) + 1;
		}
		return x;
	}

	public int genereazaY() {
		int y = generator.nextInt(101);
		if (y < 5) {
			y = 0;
		} else if (y > 95) {
			y = 50;
		} else {
			y = generator.nextInt(49) + 1;
		}
		return y;
	}

}
