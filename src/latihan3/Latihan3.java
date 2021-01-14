//Pakcage
package latihan3;
//Mengimport Scanner
import java.util.Scanner;
/**
 *
 * @author Yusuf Isra
 */
//Class
public class Latihan3 {
        //Method
      public static void main(String[] args) {
          //Membuat scanner
          Scanner masukan = new Scanner (System.in);
          //Deklarasi variabel
          int a, b, c;
        System.out.println("Program Menjumlahkan 2 nilai");
        System.out.print("Masukkan nilai a : ");
        //Menggunakan scanner
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = masukan.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = masukan.nextInt();
        System.out.println("");
        
        System.out.println("Jumlah a + b : "+jumlah(a,b));
        System.out.println("Jumlah b + c : "+jumlah(b,c));
        System.out.println("Jumlah a + c : "+ jumlah(a,c));
    }
      //Method #2
    private static int jumlah(int a, int b){
        //Oprator aritmatika
        int hasil = a + b;
        //Return = untuk mengembalikan nilai milik fungsi
        return hasil;
    }
}
