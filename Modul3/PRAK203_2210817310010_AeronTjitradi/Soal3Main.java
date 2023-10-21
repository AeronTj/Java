package Modul3.PRAK203_2210817310010_AeronTjitradi;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // Tidak ada titik koma (;) diakhir
        // p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        // integer umur belum dibuat
        p1.umur = 17;
        // Output yang diminta hanya "Nama"
        // System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        // Tambahkan kata "tahun" setelah memanggil p1.umur
        // System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}