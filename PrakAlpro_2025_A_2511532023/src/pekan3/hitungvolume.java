package pekan3;

import java.util.Scanner;

public class hitungvolume {
	public static void main(String[] args) {
		double r;
        double t;
        double volume;
        final double PI = 3.14;
        
		Scanner keyboard = new Scanner(System.in);
		 System.out.println("Masukkan jari-jari tabung:");
	        r = keyboard.nextDouble();
	        System.out.println("Masukkan tinggi tabung:");
	        t = keyboard.nextDouble();
	        keyboard.close();
	        volume = PI * r * r * t;
	        System.out.println("Volume tabung = " + volume);
	}
}