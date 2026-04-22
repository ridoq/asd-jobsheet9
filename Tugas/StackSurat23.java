package Tugas;

public class StackSurat23 {
    Surat23[] tumpukan;
    int size, top;

    public StackSurat23(int size) {
        this.size = size;
        tumpukan = new Surat23[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat23 s) {
        if (!isFull()) {
            top++;
            tumpukan[top] = s;
        } else {
            System.out.println("Gagal! Tumpukan surat sudah penuh.");
        }
    }

    public Surat23 pop() {
        if (!isEmpty()) {
            Surat23 s = tumpukan[top];
            top--;
            return s;
        } else {
            return null;
        }
    }

    public Surat23 peek() {
        if (!isEmpty()) {
            return tumpukan[top];
        } else {
            return null;
        }
    }

    public void cariSurat(String nama) {
        if (!isEmpty()) {
            boolean ketemu = false;
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("Surat ditemukan pada tumpukan ke-" + (i + 1));
                    System.out.println("ID: " + tumpukan[i].idSurat + " | Jenis: " + tumpukan[i].jenisIzin + " | Durasi: " + tumpukan[i].durasi + " hari");
                    ketemu = true;
                }
            }
            if (!ketemu) {
                System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
            }
        } else {
            System.out.println("Tumpukan masih kosong.");
        }
    }
}
