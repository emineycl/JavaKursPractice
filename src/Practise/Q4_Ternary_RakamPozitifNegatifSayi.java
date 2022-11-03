package Practise;

import java.util.Scanner;

public class Q4_Ternary_RakamPozitifNegatifSayi {

    //Kullanicidan bir sayi aliniz
    //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz
    //10 dan kucuk ise ekrana "Rakam" yazdirirniz degilse "Pozitif Sayi" yazdiriniz.
    //Sayi 0'dan kucukse ekrana "Negatif Sayi" yazdiriniz

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");

        int num= scan.nextInt();

        System.out.println("****************************** If Cozumu *************************************");

        if (num>0) {
            if (num<10){
                System.out.println("Girdiginiz sayi bir rakamdir");
            } else {
                System.out.println("Girdiginiz sayi pozitif sayidir");
            }
        }else {
            System.out.println("Girdiginiz sayi negatif sayidir");
        }

        System.out.println("***********************  Ternary Cozumu  **********************************************");

        String result= (num>0) ? (num<10)? ("Sayiniz Rakamdir"):("Sayiniz pozitif sayidir"):("Sayiniz Negatif sayidir");
        System.out.println(result);


    }
}
