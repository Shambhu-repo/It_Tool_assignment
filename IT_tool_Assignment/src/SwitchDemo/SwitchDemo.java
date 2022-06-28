package SwitchDemo;

import java.util.ArrayList;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> futureMonth = new ArrayList<String>();
		int month =8;
		switch(month) {
		case 1: futureMonth.add("jan");
		case 2: futureMonth.add("feb");
		case 3: futureMonth.add("march");
		case 4: futureMonth.add("april");
		case 5: futureMonth.add("june");
		case 6: futureMonth.add("july");
		case 7: futureMonth.add("august");
		case 8: futureMonth.add("september");
		case 9: futureMonth.add("october");
		case 10: futureMonth.add("november");
		case 11: futureMonth.add("dec");
		case 12: futureMonth.add("d");
		break;
		default:
			break;
		}
			if(futureMonth.isEmpty()) {
				System.out.println("invalid months number");
			}
			else {
				for(String months:futureMonth) {
					System.out.println("months : " +  months);
				}


		}

	}

}
