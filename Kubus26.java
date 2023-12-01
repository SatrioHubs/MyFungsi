import java.util.Scanner;

public class Kubus26 {
      static int HitungLuaspersegi(int a){
        int Luas = a * a;
        return Luas; 
      }  
      static int HitungVolume(int a){
        int Volume = HitungLuaspersegi(a)*a;
        return Volume;
      }
      static int HituungLuasPermukaan(int a, int b){
        int luasPermukaanKubus = HitungLuaspersegi(a)*b;
        return luasPermukaanKubus;
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, V, Lp;
        System.out.println("Masukan Rusuk Kubus: ");
        r = sc.nextInt();

        V = HitungVolume(r);
        System.out.println("Volume kubus tersebut: "+V);
        Lp = HituungLuasPermukaan(r, 6);
        System.out.println("Luas permukaan kubus tersebut: "+ Lp);
        sc.close();
      }
}
