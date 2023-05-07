import java.util.Scanner;

public class ReversePerkata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah string: ");
        String string = scanner.nextLine();

        String[] words = string.split(" ");

        String reverseString = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString += words[i] + " ";
        }

        System.out.println("String terbalik: " + reverseString);
    }
}
