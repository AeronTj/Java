package Modul3.PRAK201_2210817310010_AeronTjitradi;

class Buah {
    String nama;
    double berat, harga, jumlahbeli, hargasebelumdiskon, totaldiskon,  hargasetelahdiskon;

    Buah(String nama, double berat, double harga, double jumlahbeli, double hargasebelumdiskon, double totaldiskon, double hargasetelahdiskon) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahbeli = jumlahbeli;
        this.hargasebelumdiskon = hargasebelumdiskon;
        this.totaldiskon = totaldiskon;
        this.hargasetelahdiskon = hargasetelahdiskon;
    }
    void tampilkanInfoBuah() {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahbeli + "Kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hargasebelumdiskon);
        System.out.printf("Total Diskon: Rp%.2f%n", totaldiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hargasetelahdiskon);
        System.out.println();
    }
}