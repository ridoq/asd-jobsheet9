package Tugas;

import java.util.Scanner;

public class SuratDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat23 stack = new StackSurat23(10);
        int pilih;

        do {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    stack.push(new Surat23(id, nama, kls, jenis, durasi));
                    break;
                case 2:
                    Surat23 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                    } else {
                        System.out.println("Tidak ada surat untuk diproses.");
                    }
                    break;
                case 3:
                    Surat23 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat teratas milik: " + terakhir.namaMahasiswa + " (" + terakhir.idSurat + ")");
                    } else {
                        System.out.println("Tumpukan kosong.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 5:
                    System.out.println("Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
        sc.close();
    }   
}
