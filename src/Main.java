import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucreti giriniz : ");
        tutar = input.nextDouble();

        if (tutar <= 1000){
             kdvOran = 0.18;
        }
        else{
             kdvOran = 0.08;
        }

        double kdvTutar = tutar * kdvOran;
        double kdvUcret = kdvTutar + tutar;
        System.out.println("KDV'siz fiyat = " + tutar + " TL");
        System.out.println("KDV'li fiyat = " + kdvUcret + " TL");
        System.out.println("KDV tutar = " + kdvTutar + " TL");
    }
}
