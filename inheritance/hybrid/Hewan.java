package inheritance.hybrid;

public class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Ini adalah hewan bernama: " + nama);
    }
}
