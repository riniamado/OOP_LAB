package GraphicsPack;


public class Area 
{
		public double RecArea(double l,double b)
		{
			double r_area=(l*b);
			return r_area;
		}

		public double TriArea(double b,double h)
		{
			double a=1/2;
			double t_area=a*(b*h);
			return t_area;
		}

       public double SqArea(double l)
		{
    	   double s_area=l*l;
			return s_area;
			
		}	


		public double CirArea(double r)
		{
			double b=3.14;
			double c_area=b*r*r;
			return c_area;
		}
	
}