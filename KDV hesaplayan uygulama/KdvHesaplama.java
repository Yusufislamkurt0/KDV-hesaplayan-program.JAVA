import java.util.Scanner;

/**
 * KdvHesaplama
 */
public class KdvHesaplama {

    public static void main(String[] args) {
        double tutar, kdvliFiyat, kdv = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.println("Ürünün Tutarını Giriniz : ");
        tutar = input.nextDouble();
        kdvliFiyat = tutar + (tutar * kdv);
        System.out.println("Ürünün Kdvli Fiyatı : " + kdvliFiyat);

    }
}