package EjercicioElectrodomésticos;

public class Lavarropas extends Electrodoméstico {
	private int carga;
	private static final int carga_def = 5;
	
	public Lavarropas() {
		super();
		this.carga = carga_def;
	}
	public Lavarropas(float precio, float peso) {
		super(precio,peso);
	}
	public Lavarropas(int carga, float precio, String color, char consumo, float peso) {
		super(precio,color,consumo,peso);
		this.carga = carga;
	}
	public int getCarga() {
		return this.carga;
	}
	
	@Override
	public float precioFinal() {
		if(this.carga>30)precio+=50;
		return super.precioFinal();
	}
}
