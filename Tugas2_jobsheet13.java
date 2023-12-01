import java.util.Scanner;

public class Tugas2_jobsheet13 {
    public static int[][] inputData(String[] name, int[][] arData){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < arData[i].length; j++) {
                System.out.print("Nilai Untuk"+ name[i]+  "pada minggu ke-"+ (j+1)+ ": ");
            }
        }
        System.out.println("\nInput Selesai\n");
        return arData;
    }
    public static void printNilai(String nama[], int[][] arData) {
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < arData[i].length; j++) {
                System.out.print("Nilai "+ nama[i]+  " pada minggu ke-"+ (j+1)+ ": ");
            }
        }
        System.out.println("\nPrint Nilai Selesai\n");
    }
    public static int mingguTertinggi(int[][] arData) {
        int[] sumEveryweeks = new int[arData[0].length];
        for (int i = 0; i < arData[0].length; i++) {
            for (int j = 0; j < arData.length; j++) {
                sumEveryweeks[i] += arData[i][j];
            }
        }
        int highest = sumEveryweeks[0];
        int Week = 1;
        for (int i = 1; i < sumEveryweeks.length; i++) {
            if (highest < sumEveryweeks[i]) {
                highest = sumEveryweeks[i];
                Week = i+1;
            }
        }
        return Week;
    }
    public static void printTertinggi(String[] nama, int[][] arData) {
        int highest = 0, index = 0;
        for (int i = 0; i < arData.length; i++) {
            for (int j = 0; j < arData[i].length; j++) {
                if (highest < arData[i][j]) {
                    highest = arData[i][j];
                    index = i;
                }
            }
            System.out.println(nama[index] + " Nilai tertinggi yaitu " + highest + " pada minggu ke-"+mingguTertinggi(arData));
        }
    }
    public static void main(String[] args) {
        Scanner scun = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa: ");
        int jumMaha = scun.nextInt();
        System.out.print("Masukan jumlah minggu: ");
        int jumMingg = scun.nextInt();
        String[] namaMaha = new String[jumMaha];
        scun.nextLine();

        for (int i = 0; i < namaMaha.length; i++) {
            System.out.println("Masukan nama mahasiswa ke-"+ (i+1)+ " ");
            namaMaha[i] = scun.nextLine();
        }
        int[][] nilMaha = new int[jumMaha][jumMingg];
        nilMaha = inputData(namaMaha, nilMaha);
        printNilai(namaMaha, nilMaha);
        System.out.println("Pada minggu ke-" + mingguTertinggi(nilMaha) + "adalah nilai tertinggi dari nilai minggu yang lain");
        printTertinggi(namaMaha, nilMaha);
        scun.close();
    }
}
