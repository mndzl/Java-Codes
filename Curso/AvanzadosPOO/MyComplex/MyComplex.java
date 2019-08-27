package MyComplex;

public class MyComplex {
	private double real;
	private double imag;
	
	static final double REAL_DEF = 0.0;
	static final double IMAG_DEF = 0.0;
	
	public MyComplex(){
		this.real = REAL_DEF;
		this.imag = IMAG_DEF;
	}
	MyComplex(double real, double imag){
		this.real = real;
		this.imag = real;
	}
	
	public double getReal() {
		return this.real;
	}
	public double getImag() {
		return this.imag;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	@Override
	public String toString() {
		return "(" + this.real + "+" +  this.imag + "i)";
	}
	
	public boolean isReal() {
		return this.imag==0;
	}
	public boolean isImaginary() {
		return this.imag!=0;
	}
	public boolean equals(double real, double imag){
		return (this.real == real && this.imag == imag);
	}
	public boolean equals(MyComplex another) {
		return (this.real == another.real && this.imag == another.imag);
	}
	public double magnitude() {
		
	}
	public double argument() {
		
	}
	public MyComplex add(MyComplex right) {
		this.real += right.real;
                this.imag += right.imag;
                return this;
	}
	public MyComplex addNew(MyComplex right) {
		MyComplex m = new MyComplex(this.real + right.real,this.imag+this.real);
                return m;
	}
	public MyComplex substract(MyComplex right) {
                this.real -= right.real;
                this.imag -= right.imag;
                return this;
	}
	public MyComplex substractNew(MyComplex right) {
		MyComplex m = new MyComplex(this.real - right.real,this.imag-this.real);
                return m;
	}
	public MyComplex multiply(MyComplex right) {
		this.real *= right.real;
                this.imag *= right.imag;
                return this;
	}
	public MyComplex divide(MyComplex right) {
		this.real /= right.real;
                this.imag /= right.imag;
                return this;
	}
	public MyComplex conjugate(MyComplex right) {
		
	}
}
