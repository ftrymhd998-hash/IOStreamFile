// Nama: Muhammad Fitri
// NPM : 2410010204
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Array kategori, ukuran tetap, minimal 3
        String[] kategori = {"Elektronik", "Makanan", "Pakaian"};
        System.out.println("== Daftar Kategori ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        // Membuat objek pengelola dan mengisi minimal 5 barang
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Kabel HDMI", 35000, 20));
        gudang.tambahBarang(new Barang("Beras 5kg", 65000, 50));
        gudang.tambahBarang(new Barang("Kaos Polos", 45000, 30));
        gudang.tambahBarang(new Barang("Mouse Wireless", 75000, 15));
        gudang.tambahBarang(new Barang("Indomie Goreng", 3500, 200));

        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();
        System.out.println();

        // Objek baru, muat kembali dari berkas untuk membuktikan data tersimpan
        Gudang gudangLain = new Gudang("barang.txt");
        gudangLain.muatDariBerkas();
        gudangLain.tampilkanSemua();
        System.out.println("Total nilai persediaan: Rp" + gudangLain.totalNilai());
    }
}