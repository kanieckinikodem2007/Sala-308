public class KontoBankowe{
	private double saldo;

	public KontoBankowe(double saldoPoczątkowe) {
		this.saldo = saldoPoczątkowe;
	}
	public void wplac(double kwota) {
		if (kwota > 0) {
			saldo += kwota;
			System.out.println("Wpłacono
