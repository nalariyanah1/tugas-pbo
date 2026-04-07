public class Main {

    public static void main(String[] args) {

        int panjang = 10;
        int lebar = 5;
        int tinggi = 4;

        BangunRuang bangun = new BangunRuang(panjang, lebar, tinggi);

        System.out.println("Luas alas : " + bangun.hitungLuas());
        System.out.println("Volume : " + bangun.hitungVolume());

    }
}