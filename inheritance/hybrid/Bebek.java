package inheritance.hybrid;

public class Bebek extends Hewan implements HewanDarat, HewanAir {

    public Bebek(String nama) {
        super(nama);
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " berjalan dengan kaki pendek di daratan.");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " berenang dengan riang di kolam.");
    }

    public void bersuara() {
        System.out.println(nama + " berbunyi: kwek kwek!");
    }
}
