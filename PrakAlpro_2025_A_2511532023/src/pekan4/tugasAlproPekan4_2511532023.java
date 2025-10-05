package pekan4;
import java.util.Scanner;

public class tugasAlproPekan4_2511532023 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String namaPembeli;
		int jumlahTiket;
		int hari = 0;
		int waktu = 0;
		int studio = 0;
		double hargaDasar = 0;
		double biayaHari = 0;
		double biayaWaktu = 0;
		double hargaPerTiket = 0;
		double subtotal = 0;
		double diskon = 0;
		double persenDiskon = 0;
		double totalBayar = 0;
			
		System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
		System.out.print("Masukkan nama pembeli: ");
		namaPembeli = scanner.nextLine();
		System.out.print("Masukkan jumlah tiket: ");
		while (!scanner.hasNextInt()) {
	        System.out.println("Input tidak valid. Masukkan angka untuk jumlah tiket.");
	        scanner.next();
	        System.out.print("Masukkan jumlah tiket: ");
	    }
		jumlahTiket = scanner.nextInt();
		if (jumlahTiket <= 0) {
	        System.out.println("Jumlah tiket harus > 0. Program dihentikan.");
	        scanner.close();
	        return;
		}
		while (hari < 1 || hari >3) {
			System.out.print("Masukkan hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
			hari = scanner.nextInt();
			if (hari < 1 || hari > 3) {
				System.out.println("Input hari tidak valid! Masukkan 1-3.");
			}
		}
		while (waktu < 1 || waktu > 3) {
			System.out.print("Masukkan waktu tayang (1=Pagi 10:00-12:00, 2=Siang 12:00-17:00, 3=Malam 17:00-22:00): ");
			waktu = scanner.nextInt();
			if (waktu < 1 || waktu > 3) {
				System.out.println("Input waktu tidak valid! Masukkan 1-3.");
			}
		}
		while (studio < 1 || studio > 3) {
			System.out.print("Masukkan jenis studio (1=Regular, 2=Deluxe, 3=Premium): ");
			studio = scanner.nextInt();
			if (studio < 1 || studio > 3) {
				System.out.println("Input studio tidak valid! Masukkan 1-3.");
			}
		}
			
		switch (studio) {
	    	// Reguler
		    case 1: hargaDasar = 30000.0;
	    	        break;
		    // Deluxe
		    case 2: hargaDasar = 40000.0;
		            break;
		    // Premium
		    case 3: hargaDasar = 55000.0;
	    	        break;
		    default: hargaDasar = 30000.0;
		            break;
	    	}
		
		switch (hari) {
		    // Senin-Kamis
		    case 1: biayaHari = hargaDasar * 0.00; 
	         	    break;
    		// Jumat
    		case 2: biayaHari = hargaDasar * 0.10; // +10%
    	         	break;
    		// Sabtu-Minggu
    		case 3: biayaHari = hargaDasar * 0.20; // +20%
    	        	break;
    		default: biayaHari = 0;
    	            break;
    		}
    		
		switch (waktu) {
    		// Pagi
    		case 1: biayaWaktu = hargaDasar * 0.00; 
    	        	break;
    		// Siang
    		case 2: biayaWaktu = hargaDasar * 0.10; // +10%
    	        	break;
    		// Malam
    		case 3: biayaWaktu = hargaDasar * 0.20; // +20%
            		break;
    		default: biayaWaktu = 0;
    	        	break;
    		}
 		
		hargaPerTiket = hargaDasar + biayaHari + biayaWaktu;
		subtotal = hargaPerTiket * jumlahTiket;
			
		if (jumlahTiket >= 10) {
			persenDiskon = 0.30;
			diskon = subtotal * persenDiskon;
		} else if (jumlahTiket >= 5) {
			persenDiskon = 0.20;
			diskon = subtotal * persenDiskon;
		} else {
			persenDiskon = 0.00;
		}
		
		totalBayar = subtotal - diskon;
		
		System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
		System.out.println("Nama Pembeli    : " + namaPembeli);
		System.out.println("Jumlah Tiket    : " + jumlahTiket);
		System.out.println("Hari            : " + (hari == 1 ? "Senin-Kamis" : hari == 2 ? "Jumat" : "Sabtu-Minggu"));
		System.out.println("Waktu Tayang    : " + (waktu == 1 ? "Pagi" : waktu == 2 ? "Siang" : "Malam"));
		System.out.println("Jenis Studio    : " + (studio == 1 ? "Regular" : studio == 2 ? "Deluxe" : "Premium"));
		System.out.println("---------------------------------");
		System.out.println("Harga Dasar     : Rp " + (int)hargaDasar + "/tiket");
		System.out.println("Biaya Hari      : +" + (hari == 1 ? "0%" : hari == 2 ? "10%" : "20%"));
		System.out.println("Biaya Waktu     : +" + (waktu == 1 ? "0%" : waktu == 2 ? "10%" : "20%"));
		System.out.println("Harga per Tiket : Rp " + (int)hargaPerTiket);
		System.out.println("Subtotal        : Rp " + (int)subtotal);
		System.out.println("Diskon (" + (int)(persenDiskon * 100) + "%)    : Rp " + (int)diskon);
		System.out.println("---------------------------------");
		System.out.println("TOTAL BAYAR     : Rp " + (int)totalBayar);
		scanner.close();
    }
}