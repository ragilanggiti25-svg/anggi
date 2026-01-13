public class BinarySearchString {

    public static int binarySearch(String[] data, String key) {
        int low = 0, high = data.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = key.compareToIgnoreCase(data[mid]);

            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] nama = {"Andi", "Budi", "Citra", "Dewi", "Eka"};
        String cari = "Dewi";

        int hasil = binarySearch(nama, cari);

        if (hasil != -1)
            System.out.println("Nama ditemukan di indeks " + hasil);
        else
            System.out.println("Nama tidak ditemukan");
    }
}
    

