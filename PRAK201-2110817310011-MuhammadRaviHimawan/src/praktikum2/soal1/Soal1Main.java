package praktikum2.soal1;

public class Soal1Main {

    public static void main(String[] args) {
        Buah arumanis = new Buah("Arumanis", (float) 0.3,13,5000);
        Buah manalagi = new Buah("Manalagi", (float) 0.5,17,7500);
        Buah madu = new Buah("Madu", (float) 0.375,12,6500);
        
        arumanis.displayMangga();
        System.out.println("");
        manalagi.displayMangga();
        System.out.println("");
        madu.displayMangga();
    }
    
}
