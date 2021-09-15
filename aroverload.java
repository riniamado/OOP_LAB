/*Write a program to find the area of rectangle, circle and square using overloaded functions.
*/
class Overload
{
	public void area(int l,int b,int h)
	{
		System.out.println("Area of Rectangle:"+(l*b*h));
	}
	public void area(int l)//area of square
	{
		System.out.println("Area of Square:"+(l*l));
	}
	public void area(double r)//area of circle
	{
		double c_area=3.14*r*r;
		System.out.println("Area of Circle:"+c_area);
	}
}
public class aroverload
{
	public static void main(String args[])
	{
		Overload obj=new Overload();
		obj.area(20,13,24);
		obj.area(50);
		obj.area(3.1);
	}

}