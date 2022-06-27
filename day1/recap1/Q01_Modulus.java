package day1.day1.recap1;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 5 basamaklı bir sayi giriniz : ");
        int num = scan.nextInt();

        int ilkIki= num/1000; // içinde kaç tane oldugu
        int sonIki= num%100; // 100'e bolumunden kalan

        int ilkIkiTop = (ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki/10) + (sonIki%10);
        System.out.println("sonIkiTop = " + sonIkiTop);

        System.out.println("Toplam = "   + (ilkIkiTop + sonIkiTop));


    }

}
