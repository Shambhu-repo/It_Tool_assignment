package Test;

public class ForLoopAndBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		try {
		for (int i=0;i<5;i++) {
			if(k==3) {
				System.out.println("print repetative time" + i);
			Thread.sleep(3000);
			}
			else {
				System.out.println("its  k==3 " + i);
				break;
			}
		}

		}
		catch(Exception e) {
			System.out.println(e);
		}

}
}
