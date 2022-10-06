package Practise;

import org.ietf.jgss.GSSContext;

import java.util.Scanner;

public class Q3_Scanner_IfStatement {
    public static void main(String[] args) {


        /* Kullanicidan iki farkli dogum gunu tarihi alin kimin yasca daha buyuk oldugunu
        konsola yazdirian bir program yazin. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Karsilastirmak istediginiz dogum tarihinlerinden ilkini " +
                "\nYil , \nAy , \nGun ,seklinde giriniz" );

               int ilkYil=scan.nextInt();
                int ilkAy =scan.nextInt();
                int ilkGun=scan.nextInt();

        System.out.println("Karsilastirmak istedginiz dogum gunlerinden  ikincisini " +

                "\nYil ,\nAy ,\nGun, \n\tseklinde giriniz : ");

        int ikinciYil= scan.nextInt();
        int ikinciAy= scan.nextInt();
        int ikinciGun= scan.nextInt();

        if (ilkYil<ikinciYil) {
            System.out.println("Ilk kullanici daha yaslidir");
        } else if (ikinciYil<ilkYil) {
            System.out.println("Ikinci kullanici daha yaslidir");
        } else {  // bu satira geldigimizde yillarin esit olma durumu inceleyelim

            if (ilkAy<ikinciAy) {
                System.out.println("Ilk kullanici daha yaslidir");
            } else if (ikinciAy<ilkAy) {
                System.out.println("Ikinci kullanici daha yaslidir");
            } else {
                if (ilkGun<ikinciGun) {
                    System.out.println("Ilk kullanici daha yaslidir");
                } else if (ikinciGun<ilkGun) {
                    System.out.println("Ikinci kullanici daha yaslidir");
            }else {
                    System.out.println("Siz ikizsiniz... :)");
                }

        }}

/*    IKINCI YÖMTEM (bIRAZ DAHA KISA AMA ARALARA SARTLAR EKLENMELI, AY 12 DEN BUYUK OLAMAZ)*

//----------------Yil-Ay-Gun birlestirip sayisal deger elde ederek-------------
    int ilkDogumGunu= ilkYil*10000 +ilkAy*100 +ilkGun;
        int ikinciDogumGunu= ikinciYil*10000+ikinciAy*100+ikinciGun;

            //2007/09/12===>20070912
        //2006/11/09===>20061109
        if (ilkDogumGunu<ikinciDogumGunu) {
            System.out.println("Ilk kullanici daha yaslidir");
        } else if (ikinciDogumGunu<ilkDogumGunu) {
            System.out.println("Ikinci kullanici daha yaslidir");
        }else {
            System.out.println("Siz ikizsiniz... :)");
        }

            */

            scan.close();

            }
            }