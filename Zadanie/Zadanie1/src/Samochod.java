public class Samochod{
	private String marka;
	private String model;
	private int rokProdukcji;

	public Samochod(String marka, String model, int rokProdukcji){
		this.marka = marka;
		this.model = model;
		this.rokProdukcji = rokProdukcji;
	}
	public void wyswietlInfo(){
		System.out.println(marka + " " + model + ", rok: "+ rokProdukcji);
	}
}
