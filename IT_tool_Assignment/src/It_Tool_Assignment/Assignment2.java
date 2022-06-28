package It_Tool_Assignment;

public class Assignment2 {
	int a = 2; // instace variable intialization
	int b = 3;

	int sum; // instance variable declaration
	int subtraction;
	int multiplication;
	int divide;

	public void add() { // taking instance value
		sum = a + b;
		System.out.println(sum);
	}

	public void sub(int c, int d) { // passing parameter and providing user input while calling method
		subtraction = c - d;
		System.out.println(subtraction);
	}

	public int mult(int e, int f, int g) { // passing parameter and storing output in instance variable
		multiplication = e * f * g;

		return multiplication;
	}

	public void divide() { // local variables
		int divide1;
		int h = 20;
		int i = 2;
		divide1 = h / i;
		System.out.println(divide1);
	}

	public static void main(String[] args) {
		Assignment2 assignment = new Assignment2();
		assignment.add();
		assignment.sub(120, 20); // we can put any argument like , (100025,1245 )
		int x = assignment.mult(2, 5, 4);
		System.out.println(x);
		assignment.divide();
	}

}
