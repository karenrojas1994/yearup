
public class Item 
{

		String m_name = null;
		double m_price = 0.0;
		int m_quantity = 0;
		// 
	/*Item(String name, double price, int quantity)
	{
		m_name = name;
		m_price= price;
		
	}*/
		Item(String name, double price, int quantity)
		{	
			m_name = name;
			m_price = price;
			m_quantity = quantity;
			//
		}

		public String get_name() {
			return m_name;
		}

		public void set_name(String m_name) {
			this.m_name = m_name;
		}

		public double get_price() {
			return m_price;
		}

		public void set_price(double m_price) {
			this.m_price = m_price;
		}

		public int get_quantity() {
			return m_quantity;
		}

		public void set_quantity(int m_quantity) {
			this.m_quantity = m_quantity;
		}
	
	
	
}	
