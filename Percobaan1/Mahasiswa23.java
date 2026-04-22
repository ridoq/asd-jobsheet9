package Percobaan1;

public class Mahasiswa23 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa23(String nim, String nama, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai){
        this.nilai = nilai;
    }
}
