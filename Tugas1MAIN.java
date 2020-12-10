import Tugas1.MergeSort;

/**
 * Tugas1MAIN
 */
public class Tugas1MAIN {

    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80,90};
        int cari = 30;
        System.out.println("Sorting dengan merge sort");
        MergeSort mSort = new MergeSort();
        System.out.println("Data Awal ");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Di Urutkan/Shorting");
        mSort.printArray(data);
    
        Searching find = new Searching(data, 8);
        System.out.println("Isi Array  " );
        find.TampilData();

        System.out.println("Menggunakan Binarry Search ");
        int posisi = find.FindBinarrySearch(cari, 0,  data.length -1);
        find.TampilPosisi(cari, posisi);

    }
}