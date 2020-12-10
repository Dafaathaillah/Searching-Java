import java.util.Scanner;

/**
 * Tugas2Main
 */
public class Tugas2Main {

    public static void main(String[] args) {
        Scanner dafa = new Scanner(System.in);
        int[][] data = {{45,78,7,200,80}, {90,1,17,100,50}, {21,2,40,18,65}};
        Tugas2 pencarian = new Tugas2(data, 3, 5);
        
        System.out.println("Pencarian Data Array 2D Menggunakan Sequential Search");
        System.out.println("=======================================================");
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("=======================================================");
        
        System.out.print("Masukkan data yang dicari : ");
        int cari = dafa.nextInt();
        
        int[] posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
    }
}