public class kolo extends Figura {
	private double promien;
	public kolo(String kolor, double promien){
		super(kolor);
		this.promien = promien;
}
@Override
public double obliczPole() {
	return Math.PI * promien * promien;
}
@Override
public double obliczObwod(){
	return 2 * Math.PI * promien;
}
public double getPromien(){
	return promien;
}
@Override
public String toString(){
return "Kolo[promien="+ promien + ", kolor=" +getKolor() + "]";
}
}

