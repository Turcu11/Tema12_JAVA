
public class Minge {

	private float x;
	private float y;

	public Minge(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void suteaza() throws MyException {
		GenereazaRandom gr = new GenereazaRandom();
		x = gr.genereazaX();
		y = gr.genereazaY();
		if (y == 0 || y == 50) {
			throw new MyException("OUT");
		}
		if (x == 0 || x == 100) {
			if (y >= 20 && y >= 30) {
				throw new MyException("Gol");
			} else {
				throw new MyException("Corner");
			}
		}

	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
