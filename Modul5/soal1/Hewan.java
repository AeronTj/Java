package Modul5.soal1;
import java.util.Scanner;

public class Hewan {
    private String nama,ras;
    public Hewan(String n, String r) {
        this.nama = n;
        this.ras = r;
    }
    public static Hewan scanHewan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String nama = scanner.nextLine();
        System.out.print("Ras: ");
        String ras = scanner.nextLine();
        return new Hewan(nama,ras);
    }
    void display(){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah " + nama);
        System.out.println("Dengan ras " + ras);
    }
}