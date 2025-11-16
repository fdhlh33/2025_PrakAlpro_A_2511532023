package pekan7_2511532023;

/**
 * File: Akun.java
 * Class ini bertugas sebagai blueprint untuk menyimpan data akun.
 */
public class Akun_2511532023 {
    private String username;
    private String password;
    private String email;
    private int pinAngka;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPinAngka(int pinAngka) {
        this.pinAngka = pinAngka;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPinAngka() {
        return this.pinAngka;
    }

    // Validasi Password
    public boolean isPasswordValid() {
        return this.password.length() >= 8;
    }

    // Validasi Email
    public boolean isEmailValid() {
        return this.email.contains("@") && this.email.contains(".");
    }
}