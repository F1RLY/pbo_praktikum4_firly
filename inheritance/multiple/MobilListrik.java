package inheritance.multiple;

public class MobilListrik extends Mobil {
    public int kapasitasBaterai; // dalam kWh

    public void infoMobilListrik() {
        infoMobil(); // Memanggil method dari class Mobil
        System.out.println("Kapasitas Baterai: " + this.kapasitasBaterai + " kWh");
    }
    
}