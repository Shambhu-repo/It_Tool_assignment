package SwitchDemo;

public class ForAndWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("he is good");
			System.out.println("\t");
			
			/*
			 * int j=5; while(j<=5) { System.out.println("i am from while"); j++; }
			 */
			for(int j=0;j<4;j++) {
				System.out.println("nested loop");
			}
		}

	}

}
