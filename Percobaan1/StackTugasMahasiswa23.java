package Percobaan1;

import Percobaan2.StackKonversi23;

public class StackTugasMahasiswa23 {
    Mahasiswa23[] stack;
    int top, size;

    public StackTugasMahasiswa23(int size){
        this.size = size;
        stack = new Mahasiswa23[size];
        top = -1;
    }

    public boolean isFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{
            return false;
        }
    }

    public void push(Mahasiswa23 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambah tugas lagi.");
        }
    }

    public Mahasiswa23 pop(){
        if (!isEmpty()) {
            Mahasiswa23 m = stack[top];
            top --;
            return m;
        }else{
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa23 peek(){
        if (!isEmpty()) {
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa23 peek2(){
        if (!isEmpty()) {
            return stack[0];
        }else{
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print(){
        if (!isEmpty()) {
            for (int i = top; i >= 0 ; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
            System.out.println("");
        }
    }

    public int count() {
        return top + 1;
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi23 stack = new StackKonversi23();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
