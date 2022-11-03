package Practise;

import java.util.Scanner;

public class Q6_KoordinatDuzlemi {

    //Kullanicidan aldigimiz koordinat noktasinin (x=3 , y=-1)
    //koordinat duzleminde hangi bölgede oldugunu yazdiran bir kod yaziniz

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter x coordinate : ");
        int x = scan.nextInt();
        System.out.println("Enter y coordinate : ");
        int y= scan.nextInt();

        if (x>0 && y>0) {
            System.out.println("Your Point is on the 1st area");
        } else if(x<0 && y>0) {
            System.out.println("Your Point is on the 2nd area");

        }else if(x<0 && y<0) {
            System.out.println("Your Point is on the 3rd area");

        }else if(x>0 && y<0) {
            System.out.println("Your Point is on the 4th area");

        }else if(x==0 && !(y==0)) {
            System.out.println("Your Point is on the Y Axis");

        }else if(!(x==0) && y==0) {
            System.out.println("Your Point is on the X Axis");

        }else {
            System.out.println("Your Point is on the Orijin");

        }




    }
}
