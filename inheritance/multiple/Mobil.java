package inheritance.multiple;

public class Mobil extends Kendaraan {
    public int jumlahRoda;

    public void infoMobil() {
        info(); // Memanggil method dari class Kendaraan
        System.out.println("Jumlah Roda: " + this.jumlahRoda);
    }
    
}
