package eTicaretProje.core;

import eTicaretProje.Google.JGoogle;

public class GoogleEntegrasyon implements GoogleInterface {

	@Override
	public void kayitOl(String message) {
		JGoogle jGoogle=new JGoogle();
		jGoogle.googleKayit();
		
	}
		
}
