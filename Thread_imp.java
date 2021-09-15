class Multi extends Thread
{
	public void run() {
	for(int i=0;i<=10;i++)
	{
		System.out.println("5 * "+i+" = "+(5*i));
	}
	}
}
class Prime extends Thread
{
	public void run()
	{
		for(int i=2;i<=20;i++)
		{
			int c=0;
          for(int j=1;j<=i;j++)
          {
        	  if(i%j==0)
        	  {
        		  c++;
        	  }
          }
        	  
           if(c==2)
        	  {
        		  System.out.println(i);
        	  }
          }
		}
}

public class Thread_imp
{
	public static void main(String args[])
	{
 Multi obj1=new Multi();
 Prime obj2=new Prime();
 obj1.start();
 
 obj2.start();
	}
}