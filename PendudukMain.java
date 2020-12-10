import java.util.Scanner;

/**
 * PendudukMain
 */
public class PendudukMain {

    public static void main(String[] args) {
        Scanner dafa = new Scanner(System.in);
        Scanner nte = new Scanner(System.in);
        
        System.out.println("Pencarian Data Penduduk Berdasarkan NIK Penduduk");
        System.out.println("===========================================================");
        System.out.print("Jumlah data : ");
        int jml = dafa.nextInt();
        
        CariPenduduk pencarian = new CariPenduduk(jml);

        for (int i = 0; i < pencarian.jmlData; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.print("NIK : ");
            int nik = dafa.nextInt();
            System.out.print("Nama : ");
            String nama = nte.nextLine();
            System.out.print("Alamat : ");
            String alamat = nte.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisK = nte.nextLine();
            System.out.println();
            
            Penduduk P = new Penduduk(nik, nama, alamat, jenisK);
            pencarian.tambah(P);
        }
        
        System.out.print("Masukkan NIK data penduduk yang dicari : ");
        int cari = dafa.nextInt();
        System.out.println("===========================================================");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
    }
}