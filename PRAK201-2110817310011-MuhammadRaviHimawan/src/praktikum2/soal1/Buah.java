package praktikum2.soal1;

public class Buah {
    String nama_buah;
    float berat;
    int beli;
    float totalBerat;
    int harga;
    int totalHarga;
    
    public Buah (String nama_buah, float berat, int beli, int harga){
        this.nama_buah = nama_buah;
        this.berat = berat;
        this.beli = beli;
        totalBerat = berat * beli;
        this.harga = harga;
        totalHarga = harga * beli;
    }
    
    public void displayMangga(){
        System.out.println("Nama Mangga: " + nama_buah);
        System.out.println("Berat : " + berat + " kg");
        System.out.println("Jumlah Beli : " + beli);
        System.out.println("Total Berat : " + totalBerat + " kg");
        System.out.println("Total Harga: Rp. " + totalHarga);
    }
}
