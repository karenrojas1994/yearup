
	public class Main 
	{
		public static void main(String[] args) 
		{
			Blue s = new Blue();
			s.m_side = 15;
			
			Red r = new Red();
			r.m_length = 5;
			r.m_width = 10;
			
			CalculateArea(s);
			CalculateArea(r);
			
		}
		
		static void CalculateArea(Blue s) {

			// TODO Auto-generated method stub
			
		}
		static void CalculateArea(Red s)

		{
			IColor color;
			double area = s.CalCulateArea();
			System.out.println("Area for " + s.getClass() + " is " + area);
		}

	}

