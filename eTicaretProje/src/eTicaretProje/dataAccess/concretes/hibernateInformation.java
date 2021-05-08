package eTicaretProje.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretProje.dataAccess.abstracts.InformationDao;
import eTicaretProje.entities.concretes.Information;

public class hibernateInformation implements InformationDao {

	//private Information information;
	//List<String> emailX=new ArrayList<String>();

	@Override
	public void kayitOl(Information information) {

		/*for (int i = 0; i <information.get_a(); i++) {
			emailX.add(information.get_ePosta());
		}
		
		System.out.println(emailX);
		
		if ( information.get_parola().length() >= 6
				&& emailKontrol(information.get_ePosta())) {
			System.out.println("þartlar uygun...");
		} else {
			System.out.println("þartlar uygun deðil...");
		}
*/
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
