interface Student
{
	String name="Amitha";
	String branch="Mtech";
	void display();
}
interface Sports
{
	int score=90;
	String event="Basketball";
	void display();
}
class Result implements Student,Sports
{
	public void display()
	{
		System.out.println("DETAILS OF ANNUAL SPORTS DAY :");
                System.out.println("----------------------------------------");
                System.out.println("1).Name:"+Student.name);
		System.out.println("----------------------------------------");
		System.out.println("2).Branch:"+branch);
                System.out.println("----------------------------------------");
		System.out.println("3).Sport:"+event);
                System.out.println("----------------------------------------");
		System.out.println("4).Score:"+score);
	}

}
public class quest_16
{
	public static void main(String args[])
	{
		Result obj=new Result();
		obj.display();
	
	}

}