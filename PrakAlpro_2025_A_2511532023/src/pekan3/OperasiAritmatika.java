package pekan3;

import java.util.Scanner;

public class OperasiAritmatika {
	
	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input angka-1:");
		A1 = keyboard. nextInt();
		System.out.println("Input angka-2:");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("Operator Penjumlahan");
		hasil = A1 + A2;// Penjumlahan
		System.out.println("Hasil = " + hasil);
		System.out.println("Operasi pengurangan");
		hasil = A1 - A2;// Pengurangan
		System.out.println("Hasil =" + hasil);
		System.out.println("Operasi perkalian");
		hasil = A1 * A2;// Perkalian
		System.out.println("Hasil = " + hasil);
		System.out.println("Operasi hasil bagi");
		hasil = A1 / A2;// Pembagian
		System.out.println("Hasil = " + hasil);
		System.out.println("Operasi sisa bagi");
		hasil = A1 % A2;// Sisa bagi
		System.out.println("Hasil = " + hasil);//
		
	}

}
