/**
 * Tugas3Main
 */
public class Tugas3Main {

    public static void main(String[] args) {
        int[] data = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Search pencarian = new Search(data, 10);
        MergeSort ms = new MergeSort();

        System.out.println("Pencarian Nilai Array Terbesar Menggunakan Binary Search");
        System.out.println("===========================================================");
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("===========================================================");

        System.out.println("Sorting dengan merge sort : ");
        ms.mergeSort(data);
        ms.printArray(data);
        System.out.println("===========================================================");

        System.out.println("Nilai Elemen Array Terbesar : " + pencarian.maks(data));
        int cari = pencarian.maks(data);
        System.out.println("Jumlah nilai terbesar : " + pencarian.jumlahTerbesar(cari, data));
        int posisi[] = new int[pencarian.terbesar];
        for (int i = 0; i < pencarian.terbesar; i++) {
            posisi[i] = pencarian.FindBinarySearch(cari, data, 0, data.length - 1);
            if (i > 0) {
                pencarian.Tampilposisi(cari, posisi[i] + 1);
            } else {
                pencarian.Tampilposisi(cari, posisi[i]);
            }
        }
    }
}