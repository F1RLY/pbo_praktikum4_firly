package inheritance.heirarchical;

public class MainTest {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        kucing1.nama =" oyen ";
        kucing1.usia = 5 ; 
        kucing1.makan();
        kucing1.mengeong();

        Anjing anjing1 = new Anjing();
        anjing1.nama = "black";
        anjing1.usia = 5;
        anjing1.makan();
        anjing1.menggonggong();
    }
    
}
