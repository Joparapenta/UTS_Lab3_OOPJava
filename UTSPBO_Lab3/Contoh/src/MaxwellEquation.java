public class MaxwellEquation {

    private double mu0; // nilai konstanta mu0
    private double i; // nilai arus listrik pada kawat
    private double r; // nilai jari-jari kawat

    // Constructor dengan 2 parameter
    public MaxwellEquation(double i, double r) {
        this.mu0 = Math.PI * 4e-7;
        this.i = i;
        this.r = r;
    }

    // Constructor dengan 3 parameter
    public MaxwellEquation(double mu0, double i, double r) {
        this.mu0 = mu0;
        this.i = i;
        this.r = r;
    }

    // Menghitung medan magnet pada kawat dengan konstruktor 2 parameter
    public double hitungMedanMagnet() {
        return (mu0 * i) / (2 * Math.PI * r);
    }

    // Menghitung medan magnet pada kawat dengan konstruktor 3 parameter
    public double hitungMedanMagnet(double jarak) {
        return (mu0 * i) / (2 * Math.PI * r * jarak);
    }

    // Main program untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek dengan konstruktor 2 parameter
        MaxwellEquation maxwell1 = new MaxwellEquation(10, 0.01);
        double medanMagnet1 = maxwell1.hitungMedanMagnet();
        System.out.println("Medan magnet pada kawat adalah " + medanMagnet1 + " Tesla");

        // Membuat objek dengan konstruktor 3 parameter
        MaxwellEquation maxwell2 = new MaxwellEquation(4 * Math.PI * 1e-7, 10, 0.01);
        double medanMagnet2 = maxwell2.hitungMedanMagnet(0.05);
        System.out.println("Medan magnet pada jarak 0.05 meter dari kawat adalah " + medanMagnet2 + " Tesla");
    }
}
