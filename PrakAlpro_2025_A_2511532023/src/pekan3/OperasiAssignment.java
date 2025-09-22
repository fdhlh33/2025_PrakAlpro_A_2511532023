package pekan3;

import java.util.Scanner;

public class OperasiAssignment {
	
	public static void main(String[] args) {
		int A1;
		int A2;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input angka-1:");
		A1 = keyboard. nextInt();
		System.out.println("Input angka-2:");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("Assigment Penjumlahan");
		A1 += A2;// Penambahan sekarang A1 = 15
		System.out.println("Penambahan : " + A1);
		System.out.println("Assigment pengurangan");
		A1 -= A2;// Pengurangan sekarang A1 = 10
		System.out.println("Pengurangan : " + A1);
		System.out.println("Assigment perkalian");
		A1 *= A2;// Perkalian sekarang A1 = 50
		System.out.println("Perkalian : " + A1);
		System.out.println("Assigment hasil bagi");
		A1 /= A2;// Hasil bagi sekarang A1 = 10
		System.out.println("Pembagian : " + A1);
		System.out.println("Assigment sisa bagi");
		A1 %= A2;// Sisa bagi sekarang A1 = 0
		System.out.println("Sisa bagi : " + A1);//

	}
}