import java.util.Scanner;

class shape
{
    Scanner scan=new Scanner(System.in);
	double length;
	 double breadth;
	shape()
	{
		length=0.0;
		breadth=0.0;
	}
}
class square extends shape
{
	void get_input()
	{
	    System.out.println("Enter Length of Side");
	    length=scan.nextInt();
		double area=length*length;
		System.out.println("Area Of Square: "+area);
	}
}
class rectangle extends shape{
	void get_input()
	{
	     System.out.println("Enter Length of Side");
	     
	    length=scan.nextInt();
	     System.out.println("Enter Breadth of Side");
		breadth=scan.nextInt();
		double area=length*breadth;
		System.out.println("Area Of Square: "+area);
	}
}
class triangle extends shape{
	void get_input()
	{
	     System.out.println("Enter length of Side");
	    length=scan.nextInt();
	     System.out.println("Enter height of Side");
		breadth=scan.nextInt();
		double area=length*breadth*0.5;
		System.out.println("Area Of Square: "+area);
	}
}
class circle extends shape{
	
		void get_input()
	{
	    length=scan.nextInt();
	     System.out.println("Enter radius of Side");
		double area=length*length*3.14;
		System.out.println("Area Of Square: "+area);
	}
}
public class main
{
	public static void main(String args[])
	{
	    Scanner scan=new Scanner(System.in);
	    String text="y";
	    while(text.equals("y")){
		System.out.println("To Find Area 1.Square 2.Rectangle 3.Triangle 4.Circle");
		int choice=scan.nextInt();
		switch(choice)
		{
			case 1:
			square obj1= new square();
			obj1.get_input();
			 break;
			case 2:
			rectangle obj2= new rectangle();
			obj2.get_input();
			 break;
			case 3:
			triangle obj3= new triangle();
			obj3.get_input();
			 break;
			case 4:
			circle obj4= new circle();
			obj4.get_input();
			 break;
			default:
			System.out.println("ERROR");
			 break;
		}
			System.out.println("To continue...(y/n)");
		 text=scan.next();
	    }
	
	}
		
	
}