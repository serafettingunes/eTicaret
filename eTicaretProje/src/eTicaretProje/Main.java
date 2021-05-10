package eTicaretProje;

import java.util.Iterator;
import java.util.Scanner;

import eTicaretProje.business.abstracts.InformationService;
import eTicaretProje.business.concretes.InformationManager;
import eTicaretProje.core.GoogleEntegrasyon;
import eTicaretProje.dataAccess.concretes.hibernateInformation;
import eTicaretProje.entities.concretes.Information;

public class Main {

	public static void main(String[] args) {

		int a = 1;

		Scanner in = new Scanner(System.in);
		String ad;
		String soyad;
		String email;
		String parola;
		System.out.println("Kullanýcý Kayýt ");
		System.out.println("------------------------------");
		String[] dizi = new String[2];
		String[] diziSifre = new String[2];
		
		InformationService informationService = new InformationManager(new GoogleEntegrasyon());
		for (int i = 1; i <= 2; i++) {

			System.out.print("Adýnýz : ");
			ad = in.nextLine();
			System.out.print("Soyadýnýz : ");
			soyad = in.nextLine();
			System.out.print("Emailiniz : ");
			email = in.nextLine();
			System.out.print("Parolanýz : ");
			parola = in.nextLine();
			dizi[i - 1] = email;
			diziSifre[i - 1] = parola;

			
			Information information = new Information(ad, soyad, email, parola, a, dizi, diziSifre);

			informationService.kayitOl(information);

			a++;

		}
		System.out.println("Kullanýcý Giriþ ");
		System.out.println("------------------------------");
		System.out.print("Emailiniz : ");
		email = in.nextLine();
		System.out.print("Parolanýz : ");
		parola = in.nextLine();
		Information information2 = new Information("", "", email, parola, a, dizi, diziSifre);
		informationService.girisYap(information2);
	}

}
