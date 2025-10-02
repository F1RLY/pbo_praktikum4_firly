package inheritance.hybrid;

public class Main {
    public static void main(String[] args) {
        Bebek bebek = new Bebek("Bebek Peking");

        bebek.info();       // dari class Hewan
        bebek.berjalan();   // dari interface HewanDarat
        bebek.berenang();   // dari interface HewanAir
        bebek.bersuara();   // method khusus Bebek
    }
}
