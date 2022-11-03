package Emine;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //dizinin elemanlarini kullanicidan alalim.
        //daha sonra dizinin icindeki elemanlarin asal olanlarini ve olmayanlarini ayri bir sekilde yazdiralim

        System.out.println("\tASAL SAYI BULMA UYGULAMASINA HOSGELDINIZ");
        System.out.println("***************************************************");

        int asalToplam = 0;
        int asalOlmayanToplam = 0;

        String asalSayilar = "";
        String asalOlmayanSayilar = "";

        boolean asalMi = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin eleman sayisini giriniz");
        int diziUuznluk = scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int[diziUuznluk];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Dizinin " + i + ". index degerini giriniz : ");
            scanner.nextLine();

        }
        for (int sayi : sayilar) {
            for (int j = 2; j < sayi; j++) {
                if (sayi % j == 0) {
                    asalOlmayanToplam = 1;
                    asalOlmayanSayilar = String.valueOf(sayi) + " ";
                    break;

                } else {
                    asalMi = true;
                }
            }
            if (asalMi) {

                asalToplam += 1;

                asalSayilar += String.valueOf(sayi) + " ";
                asalMi = false;
            }
        }
        System.out.println("ASAL BILGILERI");
        System.out.println("Asal Toplam = " + asalToplam + " Asal Sayilar = " + asalSayilar);
        System.out.println("**************************************************************");

        System.out.println("ASAL OLMAYAN BILGILERI");
        System.out.println(
                "Asal Olmayan Toplam = " + asalOlmayanToplam + " Asal Olmayan Sayilar = " + asalOlmayanSayilar);
    }}
