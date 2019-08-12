package EjercicioElectrodomésticos;

public class Televisión extends Electrodoméstico {
	private int pulgadas;
	private boolean sintonizadorTDT;
	
	private static final boolean sintonizadorTDT_def = false;
	private static final int pulgadas_def= 20;
	
	public Televisión() {
		super();
		this.pulgadas = pulgadas_def;
		this.sintonizadorTDT = sintonizadorTDT_def;
	}
	public Televisión(float precio, float peso) {
		super(precio,peso);
	}
	public Televisión(int pulgadas, boolean sint, float precio, String color, char consumo, float peso) {
		super(precio,color,consumo,peso);
		this.pulgadas= pulgadas;
		this.sintonizadorTDT = sint;
	}
	public int getPulgadas() {
		return this.pulgadas;
	}
	public boolean getSintetizadorTDT() {
		return this.sintonizadorTDT;
	}
	@Override
	public float precioFinal() {
		if(this.pulgadas>30)precio+=precio*0.3;
		if(sintonizadorTDT)precio+=50;
		return super.precioFinal();
	}
}
