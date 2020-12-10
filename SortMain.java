/**
 * SortMain
 */
public class SortMain {

    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        int cari = 30;
        System.out.println("Sorting dengan merge sort");
        MergeSortTest mSort = new MergeSortTest();
        System.out.println("Data Awal ");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Di Urutkan/Shorting");
        mSort.printArray(data);
    }
}