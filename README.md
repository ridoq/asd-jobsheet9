#   Percobaan 1

##  Soal

1.	Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
2.	Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!
3.	Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?
4.	Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!
5.	Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!
6.	Commit dan push kode program ke Github

---

##  Jawaban

1.  berikut perbaikan yang dilakukan:

    ```java
        for (int i = top; i >= 0 ; i--) {
            ...
        }
    ```

2.  sebanyak 5 data, berikut code nya

    ```java
       StackTugasMahasiswa23 stack = new StackTugasMahasiswa23(5); 
    ```

3.  Pengecekan !isFull() sangat krusial karena kita menggunakan Array sebagai media penyimpanan dengan ukuran statis.
    -   Mengapa perlu? Untuk memastikan masih ada indeks yang tersedia dalam array sebelum memasukkan data baru.
    -   Dampaknya jika dihapus? Program akan mengalami Runtime Error berupa ArrayIndexOutOfBoundsException. Hal ini terjadi karena variabel top akan terus bertambah melebihi batas indeks tertinggi array (misal mencoba mengisi indeks ke-5 pada array berukuran 5).
4.  berikut code yang udah ditambahkan:

    ```java
       public Mahasiswa23 peek2(){
            if (!isEmpty()) {
                return stack[0];
            }else{
                System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
                return null;
            }
        } 
    ```

5.  berikut code yang ditambahkan

    ```java
        //StackTugasMahasiswa23
        public int count() {
            return top + 1;
        }
        //MahasiswaDemo23
        case 6:
            System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.count());
            break;
    ```

6.  done
---

#   Percobaan 2