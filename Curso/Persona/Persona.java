package personaEjercicio;

public class Persona {

	private String nombre;
	private String apellido;
	private String DNI;
	private byte edad;
	private char sexo;
	private float peso;
	private float altura;
	
	public static final char sexo_def = 'H';
	public static final String str_def = "";
	
	public Persona(String DNI, String nombre, String apellido, byte edad, char sexo, float peso, float altura) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		comprobarSexo(sexo);
	}
	
	public Persona(String DNI, String nombre, String apellido, byte edad, char sexo) {
		this(DNI,nombre,apellido,edad,sexo,0f,0f);
		comprobarSexo(sexo);
	}

	public Persona(String DNI, String nombre) {
		this(DNI,nombre,str_def,(byte)0,sexo_def,0f,0f);
	}
	
	public byte calcularIMC() {
		final byte ideal = -1;
		final byte debajoPesoIdeal = 0;
		final byte sobrePeso = 1;
		float IMC = this.peso/(this.altura*this.altura);
		if(IMC<20) {
			return ideal;
		}else if(IMC>=20 && IMC<=25) {
			return debajoPesoIdeal;
		}else {
			return sobrePeso;
		}
	}
	
	public boolean esMayorDeEdad() {
		return this.edad>=18;
	}
	private void comprobarSexo(char sexo) {
		if(sexo != 'M' && sexo != 'H' && sexo != 'm' && sexo != 'h')this.sexo = 'H';
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.DNI + "\nEdad: "+this.edad+"\nSexo: "+this.sexo+"\nPeso: "+this.peso+"\nAltura: "+this.altura;
	}
	
	//Getters Setters
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public String getDNI() {
		return this.DNI;
	}
	public byte getEdad() {
		return this.edad;
	}
	public char getSexo() {
		return this.sexo;
	}
	public float getPeso() {
		return this.peso;
	}
	public float getAltura() {
		return this.altura;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
}
