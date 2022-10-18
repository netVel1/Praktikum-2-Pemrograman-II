package praktikum2.soal3;

public class Pegawai {
    public String nama;
    //Tipe data yang digunakan adalah char, sementara pada getter dan class main meminta tipe data String
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    //Getter asal memiliki error karena perbedaan tipe data (String dan char)
    public String getAsal() {
        return asal;
    }
    //Pada baris ini, value j belum dideklarasi
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
