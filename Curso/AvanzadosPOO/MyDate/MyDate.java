package MyDate;
import java.util.*;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	private static final String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private static final String[] strDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	private static final int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	MyDate(int year, int month, int day){
		Scanner scanner = new Scanner(System.in);
		while(!this.isValidDate(year,month,day)) {
			System.out.print("Ingrese otra fecha en formato a m d: ");
			year = scanner.nextInt();
			month = scanner.nextInt();
			day = scanner.nextInt();
		}
		System.out.println("MyDate creado correctamente.");
	}
	
	public boolean isLeapYear(int year) {
		return this.year % 4 == 0;
	}
	
	private boolean isValidDate(int year, int month, int day) {
		if(month < 1 || day < 1 || year < 1) {
			System.out.println("La fecha introducida no es válida.");
			return false;
		}
		
		if(month > 12) {
			System.out.println("El mes " + month + " no existe.");
			return false;
		}
		
		if(day > daysInMonths[month-1]) {
			System.out.println("El mes " + month + " no tiene " + day + " dias.");
			return false;
		}
		if(year<999 || year>9999){
                    System.out.println("El año no es válido.");
                    return false;
                }
                
		this.year = year;
		this.month = month;
		this.day = day;
		return true;
	}
	//Getters and Setters
	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		Calendar calendar = new GregorianCalendar(this.year,this.month-1,this.day);
		int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
		
		return strDays[diaSemana-1] + " " + this.day + " " +strMonths[this.month-1] + " " +  this.year;
	}
	
	//Nexts and Prevs
	
	public MyDate nextDay() {
		MyDate a = this;
		if(this.day+1<=daysInMonths[this.month-1]) {
			a = new MyDate(this.year,this.month,this.day+1);
		}else {
			a.setDay(1);
			a = this.nextMonth();

		}
		return a;
	}
	public MyDate nextMonth() {
		MyDate a;
		if(this.month+1<=12) {
			a = new MyDate(this.year,this.month+1,this.day);
		}else {
			a = new MyDate(this.year+1, 1, this.day);
		}
		
		return a;
	}
	
	public MyDate nextYear() {
		MyDate a = new MyDate(this.year+1,this.month,this.day);
		return a;
	}
	public MyDate previusDay() {
		MyDate a=this;
		if(this.day-1>=1) {
			a = new MyDate(this.year,this.month,this.day-1);
			return a;
		}

		else {
			a.setDay(daysInMonths[this.previusMonth().getMonth()-1]);
			a = this.previusMonth();
		}
		
		return a;
	}
	public MyDate previusMonth() {
		MyDate a;
		if(this.month-1>=1) {
			a = new MyDate(this.year,this.month-1,this.day);
			return a;
		}else a = new MyDate(this.year-1,12,this.day);
		
		return a;
	}
	public MyDate previusYear() {
		MyDate a = new MyDate(this.year-1, this.month, this.day);
		return a;
	}

}
