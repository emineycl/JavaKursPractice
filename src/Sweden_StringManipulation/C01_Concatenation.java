package Sweden_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {

        //concatenation=birlestirme, birbirine baglama

        String a="Turkiye'nin";
        String b="Baskenti";
        String c="Ankara'dir";
        String d="";
        String e=" ";

        int f=5;
        int g=4;

        //Yukaridaki variable'lari kullanarak "Turkiye'nin Baskenti Ankara'dir" yazdirin
        //"Turkiye'nin Baskenti Ankara'dir 54" bunlari yap
        //"Turkiye'nin Baskenti Ankara'dir 9" bunlari yap


        System.out.println(a+b+c);  //Turkiye'ninBaskentiAnkara'dir
        System.out.println(a+e+b+e+c);  //Turkiye'nin Baskenti Ankara'dir
        System.out.println(a+e+b+e+c+e+f+g);  //Turkiye'nin Baskenti Ankara'dir 54
        System.out.println(a+e+b+e+c+e+(f+g));  //Turkiye'nin Baskenti Ankara'dir 9

        System.out.println(a+f+b+f+c+e+(f+g));  //Turkiye'nin5Baskenti5Ankara'dir
        System.out.println(f+g+f+g+a+g+f);     //18Turkiye'nin45
        System.out.println(f+d+g+e);  // 54
 
    }
}
