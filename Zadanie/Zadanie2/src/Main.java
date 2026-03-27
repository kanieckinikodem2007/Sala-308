  public class Main{
	   public static void main(String[] args){
	kontoBankowe konto = new KontoBankowe (1000);
    System.out.println("Saldo początkowe: " + konto.getSaldo());

    konto.wplac(500);
    System.out.println("Po wpłacie 500: " + konto.getSaldo());

    konto.wyplac(200);
    System.out.println("Po wypłacie 200: " + konto.getSaldo());

    konto.wyplac(2000);
    System.out.println("Po próbie wypłaty 2000: " + konto.getSaldo());
}
   }
