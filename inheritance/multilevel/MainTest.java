package inheritance.multilevel;

public class MainTest {
    public static void main(String[] args) {
        // Mobil car = new Mobil();
        // car.merk = "Toyota";
        // car.tahun = 2020;
        // car.JumlahRoda = 4;

        // car.infoMobil(); // Memanggil method dari class Mobil

        MobilListrik electricCar = new MobilListrik();
        electricCar.merk = "Tesla";
        electricCar.tahun = 2021;
        electricCar.jumlahRoda = 4;
        electricCar.kapasitasBaterai = 100; // dalam kWh
        electricCar.infoMobilListrik(); // Memanggil method dari class MobilListrik
        
    }
}
