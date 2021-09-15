class Fibonacci implements Runnable
{
	public void run()
	{
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<10;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
	}
}
class Even implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
}
public class Run_inter
{
	public static void main(String args[])
	{
		Fibonacci obj1=new Fibonacci();
		Even obj2=new Even();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
	}

}