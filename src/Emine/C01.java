package Emine;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {


        //A: "Excellent" B:"Great" C:"Good" D:"Passed" F: "Kaldin"
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        char not=scan.next().charAt(0) ;

        switch (not) {
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D' :
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Kaldin");
                break;
            default:
                System.out.println("Gecersiz");


        }

    }
}

