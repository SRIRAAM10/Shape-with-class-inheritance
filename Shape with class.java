import java.util.Scanner;
Scanner scan=new Scanner(System.in);
class shape
{
	int length;
	int breadth;
	shape()
	{
		length=0;
		breadth=0;
	}
}
class square extends shape
{
	void get_input()
	{
	    length=scan.nextInt;
		int area=length*length;
		System.out.println("Area Of Square: "+area);
	}
}
class rectangle extends shape{
	void get_input()
	{
	    length=scan.nextInt();
		breadth=scan.nextInt();
		int area=length*breadth;
		System.out.println("Area Of Square: "+area);
	}
}
class triangle extends shape{
	void get_input()
	{
	    length=scan.nextInt();
		breadth=scan.nextInt();
		int area=length*breadth*0.5;
		System.out.println("Area Of Square: "+area);
	}
class circle extends shape{
	
		void get_input()
	{
	    length=scan.nextInt();
		int area=length*length*3.14;
		System.out.println("Area Of Square: "+area);
	}
}
public class main
{
	public static void main(String args[])
	{
		System.out.println("To Find Area 1.Square 2.Rectangle 3.Triangle 4.Circle");
		int choice=scan.nextInt();
		switch(choice)
		{
			case 1:
			square obj= new square();
			obj.get_input();
			case 2:
			rectangle obj= new rectangle();
			obj.get_input();
			case 3:
			triangle obj= new triangle();
			obj.get_input();
			case 4:
			circle obj= new circle();
			obj.get_input();
			default:
			System.out.println("ERROR");
		}
	}
}
	
	
	
	