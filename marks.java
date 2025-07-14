package xyz;

class Total{
	int studscimarks = 76;
	int studmathmarks = 94;
	int studbiologymarks = 80;
	int studchemistrymark =95;
	void marks()
	{
		int Totalmarks=studscimarks+studmathmarks+studbiologymarks+studchemistrymark;
		float per = Totalmarks/4;
		System.out.println("student percent is: "+per+"%");
		
	}
}

public class marks {
	public static void main(String[] args)
	{
		Total p1 = new Total();
		p1.marks();
		
	}


}
