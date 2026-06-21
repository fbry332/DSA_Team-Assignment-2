import java.util.Scanner;

public class PlaylistArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        Lagu[] playlist = new Lagu[10];

        do {
            System.out.println("=== MENU PLAYLIST MUSIK ===");
            System.out.println("1. Tampilkan semua lagu");
            System.out.println("2. Tambah lagu baru");
            System.out.println("3. Hapus lagu berdasarkan judul");
            System.out.println("4. Cari lagu berdasarkan judul");
            System.out.println("5. Keluar");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaLagu(playlist);
                    break;
                case 2:
                    System.out.print("Masukkan judul lagu: ");
                    String judul = scanner.next();
                    System.out.print("Masukkan artis: ");
                    String artis = scanner.next();
                    System.out.print("Masukkan durasi (dalam menit): ");
                    double durasi = scanner.nextDouble();
                    Lagu laguBaru = new Lagu(judul, artis, durasi);
                    tambahLagu(playlist, laguBaru);
                    break;
                case 3:
                    System.out.print("Masukkan judul lagu yang ingin dihapus: ");
                    String judulHapus = scanner.next();
                    hapusLagu(playlist, judulHapus);
                    break;
                case 4:
                    System.out.print("Masukkan judul lagu yang ingin dicari: ");
                    String judulCari = scanner.next();
                    cariLagu(playlist, judulCari);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    private static void tampilkanSemuaLagu(Lagu[] playlist) {
        
    }

    private static void tambahLagu(Lagu[] playlist, Lagu lagu) {
        
    }

    private static void hapusLagu(Lagu[] playlist, String judul) {
        
    }

    private static void cariLagu(Lagu[] playlist, String judul) {
        
    }

    private static void urutkanLaguBerdasarkanDurasi(Lagu[] playlist) {
        
    }
}