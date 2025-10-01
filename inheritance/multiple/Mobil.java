package inheritance.multiple;

public class Mobil extends Kendaraan {
    public int JumlahRoda;

    public void infoMobil() {
        info(); // Memanggil method dari class Kendaraan
        System.out.println("Jumlah Roda: " + this.JumlahRoda);
    }
    
}
