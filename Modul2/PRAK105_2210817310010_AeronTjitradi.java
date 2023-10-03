package Modul2;
import java.util.Scanner;
public class PRAK105_2210817310010_AeronTjitradi {
    public static void main(String[] args) {
            final double Phi = 3.14;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan jari-jari: ");
            double jariJari = scanner.nextDouble();

            System.out.print("Masukkan tinggi: ");
            double tinggi = scanner.nextDouble();

            double volume = Phi * jariJari * jariJari * tinggi;

            System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m^3\n", jariJari, tinggi, volume);
        }
    }