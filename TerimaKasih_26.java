package MyFungsi;

public class TerimaKasih_26 {

    public static void ucapanTerimakasih() {
        System.out.println("Thank you for being the best teacher in the world.\n" +
         "You inpired in me love for learning and make me fell like i could ask you anything.");
    }

    public static void ucapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        ucapanTerimakasih();
        String ucapan = "Terimakasih pak.. bu.. semoga sehat selalu";
        ucapanTambahan(ucapan);
    }
    
}