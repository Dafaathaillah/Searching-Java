/**
 * Searching
 */
public class Searching {

    public int[] data;
    public int jumData;

    public Searching(int[] Data, int jumlData){
        this.jumData = jumlData;
        data = new int [jumlData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }
    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int j = 0; j < jumData; j++) {
            if (data[j] == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarrySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == data[mid]) {
                return (mid);
            }else if (data[mid] > cari) {
                return FindBinarrySearch(cari, left, mid-1);
            }else{
                return FindBinarrySearch(cari, mid+1, right);
            }
        }
        return - 1;
    }
    public void TampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("Data : " + x + " Ditemukan Pada Index Ke - " + pos);
        }else{
            System.out.println("Data " + x + " Tidak Di Temukan");
        }
    }
    public void TampilData(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}