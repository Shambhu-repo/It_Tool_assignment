package It_Tool_Assignment;

public class CircleArea {
	public final double pi=3.14; // pi value should not be changed
	double area;
	
	
	public double AreaOfCircle(double  radius) { // It will take radius of circle .
		
		 area = pi*(radius*radius);
		return  area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircleArea circleArea = new CircleArea();
	double area =	circleArea.AreaOfCircle(2.23); // providing radius of circle
	System.out.println(area);
	

	}

}
