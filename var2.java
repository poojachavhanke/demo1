package xyz;

class Car{
	int Carnumber=6867;
	String Carcolor="white";
	String Carcompany="Fronx";
	boolean isAutomatic=false;
	double Carprice=800000.00;
}
class Bike{
	int Bikenumber=3846;
	String Bikecolor="white";
	String Bikecompany="Fronx";
	boolean hasdiscbreaks=true;
	double Bikeprice=80000.00;
}
class Bicycle{
	int Bicyclenumber=1234;
	String Bicyclecolor="red";
	String Bicyclecompany="Hero";
	boolean hasgear=true;
	double Bicycleprice=8000.00;
}

public class var2 {
	public static void main(String[]args) {
		Car c1 = new Car();

		System.out.println("Car number is"+c1.Carnumber);
		System.out.println("Car color is"+c1.Carcolor);
		System.out.println("Car company is"+c1.Carcompany);
		System.out.println("Car price is"+c1.Carprice);
		System.out.println("Car is automatic"+c1.isAutomatic);
	    Bike b1 = new Bike();
	    System.out.println("Bike number is"+b1.Bikenumber);
	    System.out.println("Bike color is"+b1.Bikecolor);
	    System.out.println("Bike company is"+b1.Bikecompany);
	    System.out.println("Bike has discbreaks:"+b1.hasdiscbreaks);
	    System.out.println("Bike price is"+b1.Bikeprice);
	    Bicycle b2 = new Bicycle();
	    System.out.println("Bicycle number is"+b2.Bicyclenumber);
	    System.out.println("Bicycle color is"+b2.Bicyclecolor);
	    System.out.println("Bicycle company is"+b2.Bicyclecompany);
	    System.out.println("Bicycle has gear"+b2.hasgear);
	    System.out.println("Bicycle price is"+b2.Bicycleprice);
	  }
    }
	

