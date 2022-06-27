package day1.day1.recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            double vize1;
            double vize2;
            double finalNot;

            System.out.print("birinci vize : ");
            vize1=sc.nextDouble();

            System.out.print("ikinci vize : ");
            vize2=sc.nextDouble();

            System.out.print("final notu : ");
            finalNot =sc.nextDouble();

            double sonuc =((vize1+vize2)/2)*0.3 + finalNot*0.7;
            System.out.println("sonuc = " + sonuc);





        }

}
