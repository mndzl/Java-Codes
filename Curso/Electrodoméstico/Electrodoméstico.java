package EjercicioElectrodomésticos;

public class Electrodoméstico {
	protected float precioBase;
	protected String color;
	protected char consumoEnergético;
	protected float peso;
	
	protected final static String color_def = "Blanco";
	protected final static char cons_def = 'F';
	protected final static float precio_def = 100.00f;
	protected final static int peso_def = 5;
	
	protected final static char[] consumos = {'A','B','C','D','E','F'};
	protected final static String[] coloresDisponibles = {"Blanco","Negro","Rojo","Azul","Gris"};
	
	protected static float precio;
	
	public Electrodoméstico(){
		this.precioBase = precio_def;
		this.consumoEnergético = cons_def;
		this.color = color_def;
		this.peso = peso_def;
		precio = this.precioBase;
	}
	public Electrodoméstico(float precio, float peso) {
		this();
		this.precioBase = precio;
		this.peso = peso;
	}
	public Electrodoméstico(float precio, String color, char consumo, float peso) {
		this.color = color;
		this.precioBase = precio;
		this.consumoEnergético = consumo;
		this.peso = peso;
		this.comprobarColor(color);
		this.comprobarConsumoEléctrico(consumo);
	}
	
	public float getPrecioBase() {
		return this.precioBase;
	}
	public float getPeso() {
		return this.peso;
	}
	public String getColor() {
		return this.color;
	}
	public char getConsumoEnergético() {
		return this.consumoEnergético;
	}
	
	public void comprobarConsumoEléctrico(char c) {
		boolean correcto=false;
		for(char i:consumos) {
			if(i==c) {
				correcto = true;
				break;
			}
		}
		if(!correcto)this.consumoEnergético = cons_def;
	}
	public void comprobarColor(String color) {
		boolean correcto=false;
		for(String i:coloresDisponibles) {
			if(color.equalsIgnoreCase(i)) {
				correcto = true;
				break;
			}
		}
		if(!correcto)this.color = color_def;
	}
	
	public float precioFinal() {
		switch(this.consumoEnergético) {
			case 'A':precio+=100;break;
			case 'B':precio+=80;break;
			case 'C':precio+=60;break;
			case 'D':precio+=50;break;
			case 'E':precio+=30;break;
			case 'F':precio+=10;break;
		}
		if(this.peso>=0 && this.peso <=19) {
			precio+=10;
		}else if(this.peso>=20 && this.peso <=49) {
			precio+=50;
		}else if(this.peso>=50 && this.peso <=79) {
			precio+=80;
		}else if(this.peso>=80) {
			precio+=100;
		}
		return precio;
	}
	
}
