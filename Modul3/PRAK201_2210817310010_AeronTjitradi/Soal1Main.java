package Modul3.PRAK201_2210817310010_AeronTjitradi;

public class Soal1Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0, 40.0, 700000.00, 5600.00, 694400.00);
        Buah mangga = new Buah("Mangga", 0.2, 3500.0, 15.0, 262500.00, 840.00, 261660.00);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0, 12.00, 480000.00, 2400.00, 477600.00);

        apel.tampilkanInfoBuah();
        mangga.tampilkanInfoBuah();
        alpukat.tampilkanInfoBuah();
    }
}