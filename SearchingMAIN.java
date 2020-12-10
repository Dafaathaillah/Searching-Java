/**
 * SearchingMAIN
 */
public class SearchingMAIN {

    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80,90};
        int cari= 30;

        Searching find = new Searching(data, 8);
        System.out.println("Isi Array  " );
        find.TampilData();

        System.out.println("Menggunakan Squential Search : " );
        int posisi = find.FindSeqSearch(cari);
        if (posisi != -1) {
            System.out.println("Data : " + cari + " Di Temukan Pada Index ke - " + posisi);
        }else{
            System.out.println("data " + cari + " Tidak Ditemukan ");
        }

        System.out.println("==========================================================");
        System.out.println("Menggunakan Binarry Search ");
        posisi = find.FindBinarrySearch(cari, 0,  data.length -1);
        find.TampilPosisi(cari, posisi);
    }
}