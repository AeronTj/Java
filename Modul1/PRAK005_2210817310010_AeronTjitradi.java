package Modul1;
import java.util.Scanner;
public class PRAK005_2210817310010_AeronTjitradi {
public static void main(String[] args) {
        String Fav; 
        System.out.print("Masukan Makanan Favorit: ");
        Scanner input = new Scanner(System.in);
        Fav = input.nextLine();
        
        String Hobi;
        System.out.print("Masukan Hobi: ");
        Hobi = input.nextLine();
        
        System.out.println("Aku Suka Makan " + Fav + " dan Hobiku " + Hobi);
    }
    
}
