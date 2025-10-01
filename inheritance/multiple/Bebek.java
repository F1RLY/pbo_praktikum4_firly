package inheritance.multiple;

public class Bebek implements HewanDarat, HewanAir {
    private String nama;

    public Bebek(String nama) {
        this.nama = nama;
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " berjalan dengan kaki pendek di daratan.");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " berenang di kolam dengan riang.");
    }
}
