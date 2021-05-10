package eTicaretProje.business.concretes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretProje.business.abstracts.InformationService;
import eTicaretProje.core.GoogleEntegrasyon;
import eTicaretProje.core.GoogleInterface;
import eTicaretProje.dataAccess.abstracts.InformationDao;
import eTicaretProje.dataAccess.concretes.hibernateInformation;
import eTicaretProje.entities.concretes.Information;

public class InformationManager implements InformationService {
	private InformationDao dao;
	private GoogleInterface _googleInterface;

	public InformationManager(GoogleInterface googleInterface) {
		super();
		this._googleInterface = googleInterface;
	}

	public InformationManager(InformationDao dao) {
		super();
		this.dao = dao;
	}

	private Information information;
	List<String> emailX = new ArrayList<String>();

	boolean sart = false;
	int x = 0;
	int tikla;

	Scanner in = new Scanner(System.in);

	String[] emailGelen = new String[2];
	String email1;
	String email2;

	@Override
	public void kayitOl(Information information) {
		x = (int) information.get_a();

		if (1 == information.get_a()) {
			for (int i = 0; i < information.get_a(); i++) {

				// System.out.println(emailGelen[i]);

				sart = true;
			}

		} else if (2 >= information.get_a()) {
			emailGelen = information.getEmailY();

			Arrays.sort(emailGelen);
			int sayac1 = 0;
			int sayac2 = 1;

			email1 = emailGelen[sayac1].toString();
			email2 = emailGelen[sayac2].toString();

			if (email1.equals(email2)) {
				System.out.println("E-Posta ayný olamaz!!!");
				sart = false;

			} else 

			{
				sart = true;
			}

		}

		// System.out.println(emailX);

		if (information.get_ad().length() >= 2 && information.get_soyad().length() >= 2 && sart == true
				&& information.get_parola().length() >= 6 && emailKontrol(information.get_ePosta())) {

			System.out.print("Doðrulama linkine týklamak için 1  yazýnýz : ");

			tikla = Integer.parseInt(in.nextLine());
			if (tikla == 1) {
				System.out.println("Kaydýnýz baþarýyla oluþturulmuþtur...");
				this._googleInterface.kayitOl(information.get_ad());

			} else {
				System.out.println("Yanlýþ oldu!!!");
			}

		} else {
			System.out.println("þartlar uygun deðil...");
		}

	}

	@Override
	public void girisYap(Information information) {

	}

	public static final Pattern regexim = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public static boolean emailKontrol(String email) {
		Matcher matcher = regexim.matcher(email);
		return matcher.find();
	}

}
