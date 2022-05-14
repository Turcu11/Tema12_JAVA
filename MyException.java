
public class MyException extends Exception {

	private int nrOfThrows = 0;

	public MyException(String mesaj) {
		super(mesaj);
		nrOfThrows++;
	}

	public int getNrOfThrows() {
		return nrOfThrows;
	}

}
