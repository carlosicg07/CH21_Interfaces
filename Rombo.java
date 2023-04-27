
public class Rombo implements Calculadora {
	private String name;
	private double lado;
	private double dmayor;
	private double dmenor;
	
	
	public Rombo(String name, double lado, double dmayor, double dmenor) {
		this.lado = lado;
		this.name = name;
		this.dmayor = dmayor;
		this.dmenor = dmenor;
	}//constructor


	public double calcularArea() {
		return (getLado()*4);
	}//calcularArea
	public double calcularPerimetro() {
		return ((getDmayor() * getDmenor())/2);
	}//calcularPerimetro
	
	
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//getLado
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	public double getDmayor() {
		return dmayor;
	}//getDmayorr
	public void setDmayor(double dmayor) {
		this.dmayor = dmayor;
	}//setDmayor
	public double getDmenor() {
		return dmenor;
	}//getDmenor
	public void setDmenor(double dmenor) {
		this.dmenor = dmenor;
	}//setDmenor


	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", dmayor=" + dmayor + ", dmenor=" + dmenor + "]";
	}//toString



	
}//class Rombo
