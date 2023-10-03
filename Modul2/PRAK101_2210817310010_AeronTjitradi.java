package Modul2;
import java.util.Scanner;
public class PRAK101_2210817310010_AeronTjitradi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaL, tempatL;
        int tanggalL, bulanL, tahunL, TB;
        double BB;
        String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        System.out.print("Masukan Nama Lengkap : ");
        namaL = input.nextLine();
        System.out.print("Masukan Tempat Lahir : ");
        tempatL = input.next();
        System.out.print("Masukan Tanggal Lahir : ");
        tanggalL = input.nextInt();
        System.out.print("Masukan Bulan Lahir : ");
        bulanL = input.nextInt();
        System.out.print("Masukan Tahun Lahir : ");
        tahunL = input.nextInt();
        System.out.print("Masukan Tinggi Badan : ");
        TB = input.nextInt();
        System.out.print("Masukan Berat Badan : ");
        BB = input.nextDouble();
        System.out.println("Nama Lengkap " + namaL + ", Lahir di " + tempatL + " pada Tanggal " + tanggalL + " " + namaBulan[bulanL - 1] + " " + tahunL + " Tinggi Badan " + TB + " cm dan Berat Badan " + BB + " kilogram");
        }
    }