package Modul5.soal2;

public class Kucing extends Hewan {
    private String warnaBulu;
    public Kucing(String n, String r, String w) {
        super(n, r);
        warnaBulu = w;
    }
    @Override
    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}