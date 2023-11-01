package java101;
import java.util.Scanner;

public class DonguOrtalama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Son sayı değerini giriniz: ");
        int sayi = inp.nextInt();
        int toplam=0;
        int sayac=0;

        for(int i=0 ;i<=sayi;i++){
            if(i%3 == 0 && i%4 == 0){
                toplam += i;
                sayac++;
            }
        }
        System.out.println("3 ve 4'e bölünebilen sayıların toplamı: "+toplam);
        double ortalama = (double)toplam / sayac;
        System.out.println("3 ve 4'e bölünebilen sayıların toplamının ortalaması: "+ortalama);
    }
}
