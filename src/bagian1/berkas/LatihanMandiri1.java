package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        // Soal 1: cek laporan.txt
        File laporan = new File("laporan.txt");
        if (laporan.exists()) {
            System.out.println("Berkas ada, ukuran: " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        // Soal 2: buat folder arsip
        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat (mungkin sudah ada).");
        }

        // Soal 3: buat lalu hapus sementara.txt
        File sementara = new File("sementara.txt");
        try {
            sementara.createNewFile();
            System.out.println("Sebelum dihapus, ada? " + sementara.exists());
            sementara.delete();
            System.out.println("Sesudah dihapus, ada? " + sementara.exists());
        } catch (IOException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
