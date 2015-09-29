
public class CalculateArea {

	public static void main(String[] args)
	{
		double areaInMainMethod = CalculateCircleArea(10);  
		System.out.println(" area a circle is " + areaInMainMethod);
		double areaInMianMethod = CalculateRectangleArea(20,3);
		System.out.println(" area a rectangle is " + areaInMainMethod + " and " + areaInMianMethod);		
	}

	
public static double CalculateCircleArea(int radius)
{
//This method calculates the area of a circle
//Input: integer radius value
//Output:double area

double area =3.14 * radius * radius;
return area;
}
public static double CalculateRectangleArea(int width, int length){
	double area= length*width;
	return area;
	
}
}
