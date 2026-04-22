package Percobaan1;

import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackTugasMahasiswa23 stack = new StackTugasMahasiswa23(5);
        
        int pilih;
        do{
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Tugas Terbawah");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.println("6. Melihat Jumlah Tugas yang Telah dikumpulkan");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa23 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        
                        // Tambahkan baris di bawah ini untuk Percobaan 2 
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa23 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa23 lihat2 = stack.peek2();
                    if (lihat2 != null) {
                        System.out.println("Tugas Pertama dikumpulkan oleh " + lihat2.nama);
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.count());
                    break;
                case 7:
                    System.out.println("\nBerhasil Keluar\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }while(pilih >= 1 && pilih <= 6);
        
        sc.close();
    }
}
