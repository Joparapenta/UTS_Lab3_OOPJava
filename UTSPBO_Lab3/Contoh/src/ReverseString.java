import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah string: ");
        String string = scanner.nextLine();

        // mengubah string menjadi array of karakter
        char[] charArray = string.toCharArray();

        // inisialisasi variabel untuk menampung string terbalik
        String reverseString = "";

        // membalikkan array of karakter dan menyusunnya kembali menjadi string terbalik
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseString += charArray[i];
        }

        // menampilkan string terbalik
        System.out.println("String terbalik: " + reverseString);
    }
}
