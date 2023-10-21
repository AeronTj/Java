package Modul3.PRAK203_2210817310010_AeronTjitradi;

    // Seharusnya class Pegawai, bukan Employee
    // public class Employee {
    public class Pegawai {

        public String nama;
        //Seharusnya String, bukan char
        // public char asal;
        public String asal;
        public String jabatan;
        public int umur;

        public String getNama() {
            return nama;
        }

        public String getAsal() {
            return asal;
        }

        // Menambahkan parameter j untuk menginisialisasi jabatan
        // public void setJabatan() {
        public void setJabatan(String j) {
            this.jabatan = j;
        }
    }