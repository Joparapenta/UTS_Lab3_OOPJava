import java.util.Scanner;

class Siswa {
    private String nama;
    private int umur;

    // Getter untuk variabel nama
    public String getNama() {
        return nama;
    }

    // Setter untuk variabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk variabel umur
    public int getUmur() {
        return umur;
    }

    // Setter untuk variabel umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // membuat objek dari class Siswa
        Siswa siswa = new Siswa();

        // mengambil inputan dari pengguna
        System.out.print("Masukkan nama siswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur siswa: ");
        int umur = scanner.nextInt();

        // menggunakan setter untuk mengatur nilai variabel instance nama dan umur
        siswa.setNama(nama);
        siswa.setUmur(umur);

        // menggunakan getter untuk mengambil nilai variabel instance nama dan umur
        String namaSiswa = siswa.getNama();
        int umurSiswa = siswa.getUmur();

        // menampilkan nilai variabel instance nama dan umur
        System.out.println("Nama siswa: " + namaSiswa);
        System.out.println("Umur siswa: " + umurSiswa);
    }
}
