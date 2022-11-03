package Emine;

public class Arrays {
    public static void main(String[] args) {

        //Dizi Olusturma - deger atama - yazdirma

        String[] isimDizisi = {"Emine","Esma","Ahmet", "Nuri","Sundus"};
        System.out.println("<----------------------->");
        System.out.println("\tDIZININ ELEMANLARI");
        System.out.println("<----------------------->");

        for (int i = 0; i <isimDizisi.length; i++) {
            System.out.println(isimDizisi[i]);

        }
    }
}
