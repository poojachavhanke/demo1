package abc;
class ABC{
	int a = 100;
	int b = 50;
	void addi() {
		int c ;
		c = a + b;
		System.out.println("addition: " +c);
		System.out.println("this is method for addition");
	}
	}
class PQR {
	int a = 100;
	int b = 50;
	void sub()
	{
		int c ;
		c = a-b;
		System.out.println("subtraction: " +c);
		System.out.println("this is method for subtraction");
	}
}
public class Add {
	public static void main(String[] args) {
		ABC a1 = new ABC();
		a1.addi();
		PQR p1 = new PQR();
		p1.sub();
		LMN l1 = new LMN();
		l1.mul();
		JKH j1 = new JKH();
		j1.div();
		ASD s1= new ASD();
		s1.mod();
		}
	}
class LMN{
	int a = 100;
	int b = 50;
	void mul()
	{
		int c ;
		c = a*b;
		System.out.println("multiplication:"+c);
		System.out.println("this is method for multiplication");
	}
}
class JKH{
	int a = 100;
	int b = 50;
	void div()
	{
		int c ;
		c = a-b;
		System.out.println("division:" +c);
		System.out.println("this is method for division");
	}
}
class ASD{
	int a = 100;
	int b = 50;
	void mod()
	{
		int c ;
		c = a%b;
		System.out.println("modulo:"+c);
		System.out.println("this is method for modulo");
	}
}