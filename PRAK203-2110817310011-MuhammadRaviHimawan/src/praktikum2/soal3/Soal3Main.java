package praktikum2.soal3;

public class Soal3Main {

    public static void main(String[] args) {
    Pegawai p1 = new Pegawai();
    //Pada baris ini memiliki error karena tidak memiliki titik koma (;)
    //p1.nama = "Roi"
    p1.nama = "Roi";
    //Pada baris ini memiliki error karena tipe data yang diminta adalah String dan pada class Pegawai tipe data adalah char
    p1.asal = "Kingdom of Orvel";
    p1.setJabatan("Assasin");
    //Data umur belum dimasukkan, sehingga outputnya umur menjadi 0
    p1.umur = 17;
    System.out.println("Nama Pegawai: " + p1.getNama());
    System.out.println("Asal: " + p1.getAsal());
    System.out.println("Jabatan: " + p1.jabatan);
    //String "tahun" belum ditambahkan di belakang 
    //System.out.println("Umur: " + p1.umur);
    System.out.println("Umur: " + p1.umur + " tahun");
    }
    
}
