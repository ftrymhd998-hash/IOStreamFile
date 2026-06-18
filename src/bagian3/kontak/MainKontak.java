package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@mail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@mail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@mail.com"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();

        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
        System.out.println();

        // Uji method cariKontak (Latihan Mandiri 3.4 No. 1)
        bukuLain.cariKontak("Budi");
        bukuLain.cariKontak("Eka");
        System.out.println();

        // Uji method hapusKontak (Latihan Mandiri 3.4 No. 3)
        bukuLain.hapusKontak("Andi");
        bukuLain.tampilkanSemua();
    }
}