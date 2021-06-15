class Person
{
	String name,gender,address;
	int age;
	public Person(String name,String gender,String address,int age)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
		
	}
}

class Employee extends Person
{
	int empid,salary;
	String company_name,qualification;
	public Employee(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary)
	{
		super(name,gender,address,age);
		this.empid=empid;
		this.salary=salary;
		this.company_name=company_name;
		this.qualification=qualification;
	}
	
}
class Teacher extends Employee
{
	public Teacher(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary)
	{
		super(name,gender,address,age,empid,company_name,qualification,salary);

	}
	public void dis()
	{
		System.out.println(name+" : "+gender+" : "+address+" : "+age+" : "+empid+" : "+company_name+" : "+qualification+" : "+salary);
	}
}

public class Inhper_15
{

	public static void main(String[] args) 
	{
	  
	  System.out.println("Enter the number of Teachers:");

	  Teacher t[]=new Teacher[5];
	
      t[0]=new Teacher("Amitha","female","Bombay",20,10331,"Daravi Center","MscForensic",30850);
      t[1]=new Teacher("Aryan","male","Bengal",25,10121,"Kolkata Aerospace","Msc phy",47800);
      t[2]=new Teacher("Aksa","female","kerela",22,101234,"kochi Park ","Msc CS",50670);
      t[3]=new Teacher("Mia","female","Madhya Pradesh",26,10341,"Bhopal Infopark","MCA",50000);
      t[4]=new Teacher("chandan","male","Tamil Nadu",22,10541,"Chennai Sciences","Msc Botany",78560);
         
      System.out.println("-------The details are------");
	     System.out.println("Name|Gender|city|Company_name|Qualification|salary");
             System.out.println("-----------------------------------------------------------------------------------------------------");
	    
	  for(Teacher i:t)
	  {
		  i.dis();
	  }

	}

}