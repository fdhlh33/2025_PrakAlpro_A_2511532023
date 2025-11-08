package pekan6_2511532023;

import java.util.Scanner;
import java.util.Random;

public class tugasPekan6_2511532023 {
	public static void main(String[] args) {
	        
	    Scanner scanner = new Scanner(System.in);
	    Random rand = new Random();
	        
	    String ulangi;
	    int jumlahPercobaan = 0;
	    boolean menang = false;

	    do {
	        jumlahPercobaan++;

	        int dadu1 = rand.nextInt(6) + 1;
	        int dadu2 = rand.nextInt(6) + 1;
	        int sum = dadu1 + dadu2;
	        System.out.println(dadu1 + " + " + dadu2 + " = " + sum);

	        if (sum == 7) {
	            System.out.println("Tebakan Anda Benar");
	            System.out.println("Anda menang setelah " + jumlahPercobaan + " percobaan!");
	            menang = true;
	            ulangi = "tidak";
	            
	        } else {
	            System.out.println("Tebakan Anda Salah");
	            System.out.print("Apakah mau lempar dadu (ya / tidak?)");
	            ulangi = scanner.nextLine();
	        }

	    } while (ulangi.equalsIgnoreCase("ya"));

	    if (!menang) {
	        System.out.println("Anda gagal menang");
	    }
	    scanner.close();
	}
}