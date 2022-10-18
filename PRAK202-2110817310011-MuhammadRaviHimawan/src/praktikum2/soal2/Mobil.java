package praktikum2.soal2;

public class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    private String pemilik;
    
    /**
     * @return the pemilik
     */
    public String getPemilik() {
        return pemilik;
    }

    /**
     * @param pemilik the pemilik to set
     */
    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    
    private String pajak;
    
    public void setPajak() {
        this.pajak=pajak;
    }
    
    
    public String getPajak() {
        int pjk = harga / 50;
        //pajak 2% = 1/50
        String pajak = String.format("%,d", pjk);
        return pajak;
        
    }
    
    
    public void info(){
        System.out.println("Merek Mobil: " + merek);
        System.out.print("Harga: Rp. ");
        System.out.printf("%,d\n", harga);
        System.out.println("Tahun Keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas + "cc");
    }
    
    
}
