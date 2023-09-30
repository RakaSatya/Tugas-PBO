// Program Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //Main Program

        // Deklarasi variabel
        int nilai_ujian = 75; // Tipe data integer
        System.out.println("Nilai UAS : " + nilai_ujian);

        // Penggunaan if else
        if (nilai_ujian > 80) {
            System.out.println("Skor mu adalah A");
        } else if(nilai_ujian > 70){
            System.out.println("Skor mu adalah B");
        }else if(nilai_ujian > 60){
            System.out.println("Skor mu adalah C");
        }else{
            System.out.println("Skor mu adalah D");
        }
        

        // Array Satu Dimensi
        int[] arrSatuDimensi = {1, 2, 3, 4, 5};

        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemen ke-" + i + " = " + arrSatuDimensi[i]);
        }
        

        // Array Multi Dimensi
        int[][] arrMultiDimensi = {{2, 3, 5}, {7, 11, 13}};

        // While Loop
        int j = 0;
        while (j < 3) {
            System.out.println("Array Multi Dimensi [0]["+ j +"] = " + arrMultiDimensi[0][j] );
            j++;
        }
        
        // Do-while Loop
        int k = 0;
        do {
            System.out.println("Array Multi Dimensi [1]["+ k +"] = " + arrMultiDimensi[1][k] );
            k++;
        } while (k < 3);
        

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int input = scanner.nextInt();

        // Output
        System.out.println("Anda memasukkan: " + input);
        

        // Single line comment
        /* Multi-Line 
           Comment */

        scanner.close();
    }
}