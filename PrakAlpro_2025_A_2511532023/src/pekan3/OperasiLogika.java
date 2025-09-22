package pekan3;

import java.util.Scanner;

public class OperasiLogika {
	
	public static void main(String[] args) {
		boolean A1;
		boolean A2;
		boolean c;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input nilai boolean-1 (True / False): ");
		A1 = keyboard .nextBoolean();//Input 10
		System.out.print("Input nilai boolean-2 (True / False): ");
		A2 = keyboard .nextBoolean();
		keyboard.close();
		System.out.println("A1 = " + A1);
		System.out.println("A2 = " + A2);
		System.out.println("Konjugnsi ");
		c = A1&&A2;
		System.out.println("true and false" + c);
		System.out.println("Disjungsi");
		c = A1|A2;
		System.out.println("true or false" + c);
		System.out.println("Nagasi");
		c = !A1;
		System.out.println("Bukan true " + c);
		//
		
		
	}

}
