package Practise;

import java.util.Scanner;

public class Q5_DikUcgen {
    /*
    Kullanicidan uc adet sayi alarak bu sayilarin
    bir dik ucgenin kenar uzunlukalri olup olmadigini hesaplatan bir kod yaziniz
    Not:
    Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor denkleminden yararlanabilirsiniz.

    ------ Ornek Ekran Ciktisi -------
    ilk kenari giriniz: 2
    ikinci kenari giriniz: 15
    ucuncu kenari giriniz: 7
    Bu bir dik ucgen degildir.
    Bu bir dik ucgendir.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter first edge : ");
        int a= scan.nextInt();
        System.out.print("Enter second edge : ");
        int b= scan.nextInt();
        System.out.print("Enter third edge : ");
        int c= scan.nextInt();

        System.out.println("******************************** If Cozumu ***************************");

        if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b ) {
            System.out.println("Girdiginiz kenar uzunluklari ile bir dik ucgen olusturulabilir");
        }else {
            System.out.println("Girdiginiz kenar uzunluklari dik ucgen olusturmaz!!!");
        }

        System.out.println(" *************************** If Cozumu *************************************************");

        String result=(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b ) ? "Dik ucgendir" : "Dik Ucgne degildir" ;
        System.out.println(result);

    }
}
