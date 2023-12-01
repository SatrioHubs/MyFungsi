import java.util.Scanner;

public class Percobaan6_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukan panjang: ");
        p = sc.nextInt();
        System.out.print("Masukan lebar: ");
        l = sc.nextInt();
        System.out.print("Masukan Tinggi: ");
        t = sc.nextInt();

        L = p*l;
        System.out.print("luas persegi panjang adalah: "+ L);

        vol = p * l * t;
        System.out.print(" Volume balok adalah: "+vol);
    }
    static int HitungLuas(int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }
    static int HitungVolume(int Tinggi, int a, int b){
        int Volume = HitungLuas(a, b)*Tinggi;
        return Volume;
    }

}
