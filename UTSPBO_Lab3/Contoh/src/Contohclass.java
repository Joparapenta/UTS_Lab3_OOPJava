
class menghitung {
    public static int luas(int sisi) {

        return sisi * sisi;

    }

    public static double luas(double sisi) {

        return sisi * sisi;

    }

}

public class Contohclass {
    public static void main(String[] args) {
        menghitung luas1 = new menghitung();
        int hasil1 = menghitung.luas(2);
        double hasil2 = menghitung.luas(2.5);
        System.out.println("Hasil1 =" + hasil1);
        System.out.println("Hasil2=" + hasil2);

    }

}
