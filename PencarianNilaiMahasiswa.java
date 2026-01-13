
import java.util.Scanner;

public class PencarianNilaiMahasiswa {

    public static int binarySearch(int[] nilai, int key) {
        int low = 0;
        int high = nilai.length - 1;
        int langkah = 0;

        System.out.println("\n=== PROSES BINARY SEARCH ===");

        while (low <= high) {
            langkah++;
            int mid = (low + high) / 2;

            System.out.println("Langkah " + langkah + ":");
            System.out.println("  Indeks low = " + low + ", high = " + high + ", mid = " + mid);
            System.out.println("  nilai[" + mid + "] = " + nilai[mid]);
            System.out.println("  Nilai yang dicari = " + key);

            if (nilai[mid] == key) {
                System.out.println("  Status: NILAI DITEMUKAN!");
                System.out.println("  Total langkah: " + langkah);
                return mid;
            } else if (key < nilai[mid]) {
                System.out.println("  Status: " + key + " < " + nilai[mid] + " → cari di kiri");
                high = mid - 1;
            } else {
                System.out.println("  Status: " + key + " > " + nilai[mid] + " → cari di kanan");
                low = mid + 1;
            }
            System.out.println();
        }

        System.out.println("  Total langkah: " + langkah);
        System.out.println("  Status: NILAI TIDAK DITEMUKAN");
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array nilai mahasiswa yang sudah terurut (ascending)
        int[] nilaiMahasiswa = { 65, 70, 75, 80, 85, 90, 95, 100 };

        System.out.println("=== SISTEM PENCARIAN NILAI MAHASISWA ===");
        System.out.println("Database nilai: " + java.util.Arrays.toString(nilaiMahasiswa));
        System.out.print("\nMasukkan nilai yang ingin dicari: ");

        int nilaiCari = scanner.nextInt();
        scanner.close();

        System.out.println("\n=== MULAI PENCARIAN ===");
        System.out.println("Nilai yang dicari: " + nilaiCari);

        int hasil = binarySearch(nilaiMahasiswa, nilaiCari);

        System.out.println("\n=== HASIL PENCARIAN ===");
        if (hasil != -1) {
            System.out.println("a. Indeks ditemukan: " + hasil);
            System.out.println("b. Status: DITEMUKAN");
        } else {
            System.out.println("a. Indeks ditemukan: - (tidak ada)");
            System.out.println("b. Status: TIDAK DITEMUKAN");
        }
    }
}
