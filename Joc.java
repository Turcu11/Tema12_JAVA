
public class Joc {
	
	private String numeEchipa;
	private int totalGoluri;
	private int totalOut;
	private int totalCorner;
	
	@Override
	public String toString() {
		return "Joc [numeEchipa=" + numeEchipa + ", totalGoluri=" + totalGoluri + ", totalOut=" + totalOut
				+ ", totalCorner=" + totalCorner + "]";
	}
	public void simuleaza() {
		
	}
	
	public int addTotalGoluri() {
		return this.totalGoluri++;
	}
	public int addTotalOut() {
		return this.totalOut++;
	}
	public int addTotalCorner() {
		return this.totalCorner++;
	}
}
