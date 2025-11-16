package pekan7_2511532023;

/**
 * File: tugasAlproPekan7_2511532023.java
 * Class ini berfungsi sebagai class utama
 * Bertugas mengambil input, membuat object Akun, dan memanggil setter
 */

import java.util.Scanner;

public class tugasAlproPekan7_2511532023 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== REGISTRASI AKUN BARU ====");

        System.out.print("Masukkan Username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();

        System.out.print("Masukkan PIN (6 digit): ");
        int pin = scanner.nextInt();

        Akun_2511532023 akun = new Akun_2511532023();

        akun.setUsername(username);
        akun.setPassword(password);
        akun.setEmail(email);
        akun.setPinAngka(pin);

        if (akun.isPasswordValid() && akun.isEmailValid()) {
            
            // Kasus Berhasil
            System.out.println("\n--- REGISTRASI BERHASIL ---");
            System.out.println("Akun untuk \"" + akun.getUsername() + "\" telah berhasil dibuat.");
            
            System.out.println("\n--- Detail Akun ---");
            System.out.println("Username (Lowercase): " + akun.getUsername().toLowerCase());
            System.out.println("Email (Uppercase)   : " + akun.getEmail().toUpperCase());
            System.out.println("ID Pengguna (Gabungan): " + akun.getUsername() + akun.getPinAngka());
            
            System.out.println("\n--- Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ---");
            int pinInt = akun.getPinAngka();
            System.out.println("PIN (Int) + 10         = " + (pinInt + 10));
            
            String pinString = Integer.toString(pinInt);
            System.out.println("PIN (String) + \"10\"    = " + (pinString + "10"));

        } else {
            
            // Kasus Gagal
            System.out.println("\n--- REGISTRASI GAGAL ---");

            if (!akun.isPasswordValid()) {
                System.out.println("Password Anda \"" + akun.getPassword() + "\" tidak valid (harus 8 karakter atau lebih).");
            }
            if (!akun.isEmailValid()) {
                System.out.println("Email Anda \"" + akun.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
            }
            System.out.println("Silakan coba lagi.");
        }

        scanner.close();
    }
}