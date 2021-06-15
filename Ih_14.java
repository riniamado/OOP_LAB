class Employee
{

  int Empid,Salary;
  String name,address;
  public Employee(int id,int sal,String nme,String add)
  {
	  Empid=id;
	  Salary=sal;
	  name=nme;
	  address=add;
	  
  }
  
}
 class Teacher extends Employee
{

	String dept,subject;
	
	public Teacher(int id,int sal,String nme,String add,String d,String sub)
	{
		super(id,sal,nme,add);
		dept=d;
		subject=sub;
	}
	public void display()
	{
   
        System.out.println();
		System.out.println(Empid+" : "+Salary+" : "+name+" : "+address+" : "+dept+" : "+subject);
	}
}



 class Ih_14
{

	public static void main(String[] args) 
	{
		 Teacher[] t=new Teacher[5];
		 t[0]=new Teacher(100001,76000,"sl1","Trivandrum","MCA","java");
		 t[1]=new Teacher(107592,76000,"sl2","Kochi","mcom","dbms");
		 t[2]=new Teacher(10853,35800,"sl3","calicut","Mtech","java");
		 t[3]=new Teacher(106484,98000,"sl4","Aleppy","Btech","java");
		 t[4]=new Teacher(187505,363000,"sl5","Mallapuram","bsc","java");

		 System.out.println("-------The details are------");
	     System.out.println("Empid|Salary|Name|Address|Department|Subject");
	  	for(Teacher i:t)
	  	{
	  		i.display();
	  	}
      
	}

}


