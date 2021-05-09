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
		int sabit=1;
		Scanner in = new Scanner(System.in);
		String ad;
		String soyad;
		String email;
		String parola;
		System.out.println("Kullan�c� Kay�t ");
		System.out.println("------------------------------");
		String[] dizi =new String[2]; 
		for (int i = 1; i <=2; i++) {
			
			System.out.print("Ad�n�z : ");
			ad = in.nextLine(); 
			System.out.print("Soyad�n�z : ");
			soyad = in.nextLine(); 
			System.out.print("Emailiniz : ");
			email = in.nextLine(); 
			System.out.print("Parolan�z : ");
			parola = in.nextLine(); 
			dizi[i-1]=email;
			
			InformationService informationService=new InformationManager(new GoogleEntegrasyon());
			Information information=new Information(ad, soyad, email, parola, a,dizi,sabit);
			
			
				
			
			informationService.kayitOl(information);
		
			a++;
			
		}
		System.out.println("Kullan�c� Giri� ");
		System.out.println("------------------------------");
		
		
	}

}
