package inheritance.single;

public class MainTest {
    public static void main(String[] args) {
        Anjing dog = new Anjing();
        dog.nama = "Buddy";
        dog.umur = 3;

        dog.makan(); // Method dari class Hewan
        dog.menggonggong(); // Method dari class Anjing

        System.out.println(dog.nama + " berumur " + dog.umur + " tahun.");
    }
    
}
