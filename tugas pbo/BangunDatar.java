public class BangunDatar {

    private int panjang;
    private int lebar;

    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }
}