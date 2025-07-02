package github_learning;
import java.util.*;

public class CalculatorDrive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hesap Makinesi Uygulamasına Hoş Geldinizz");
		System.out.println();
		
		
		
		
		int secim = 0;
		while (secim != 5) {
			System.out.println("Yapmak İstediğiniz İşlemi Seçiniz");
			System.out.println("1- Toplama");
			System.out.println("2- Çıkarma");
			System.out.println("3- Çarpma");
			System.out.println("4- Bölme");
			System.out.println("5- Çıkış");
			System.out.println();
			secim = input.nextInt();
			if(secim == 5) {
				System.out.println("Çıkış Yapılıyor.... İyi Günler");
				break;
			}
			
			System.out.println("1. Sayıyı Giriniz: ");
			int sayı1 = input.nextInt();
			System.out.println("2. Sayıyı Giriniz: ");
			int sayı2 = input.nextInt();
			CalculatorApp hesaplama = new CalculatorApp(sayı1,sayı2);
			
			
			
			switch(secim) {
			case 1:
				System.out.println("Sonuç: " + hesaplama.add(sayı1, sayı2));
				break;
						
			case 2:
				
				System.out.println("Sonuç: " + hesaplama.subtract(sayı1, sayı2));
				break;
			case 3:
				
				System.out.println("Sonuç: " + hesaplama.multiply(sayı1, sayı2));
				break;
			case 4:
				
				System.out.println("Sonuç: " + hesaplama.divide(sayı1, sayı2));
				break;
				
			default:
				System.out.println("Yanlış Değer girdiniz!!!");
			}
		}

	}

}
