package Modul3.PRAK202_2210817310010_AeronTjitradi;

public class Kopi {
    String namaKopi, ukuran, pembeli;
    double harga;
    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.printf("Harga: Rp. %.1f%n", harga);
    }
    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }
    public double getPajak() {
        double pajak = 0.11 * harga;
        return pajak;
    }
    public String getPembeli() {
        return pembeli;
    }
}
