import java.util.Scanner;

public class UcapanTerimakasih_26 {
    static Scanner sc = new Scanner(System.in);
    public static String PenerimaUcapan(){
        System.out.println("Tuliskan NAMA orang yang akan beri ucapan");
        String namaOrang = sc.nextLine();
        // sc.close();
        return namaOrang;
    }
    public static void ucapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }
    public static void ucapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " +nama+ " for being the best teacher in the world.\n" +
        "You inpired in me love for learning and make me fell like i could ask you anything.");
        
    }
    public static void main(String[] args) {
        ucapanTerimakasih();
        System.out.println("Masukan pesan tambahan untuk penerima");
        String tambahan = sc.nextLine();
        ucapanTambahan(tambahan); 
        sc.close();
    }
}
