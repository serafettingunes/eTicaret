package eTicaretProje.entities.concretes;

import eTicaretProje.entities.abstracts.InformationInterface;

public class Information implements InformationInterface {
	private String _ad;
	private String _soyad;
	private String _ePosta;
	private String _parola;
	private int _a;

	private String[] _emailY;
	private String[] _parolaY;

	public String[] get_parolaY() {
		return _parolaY;
	}

	public void set_parolaY(String[] _parolaY) {
		this._parolaY = _parolaY;
	}

	public String[] getEmailY() {
		return _emailY;
	}

	public void setEmailY(String[] emailY) {
		this._emailY = emailY;
	}

	public long get_a() {
		return _a;
	}

	public void set_a(int _a) {
		this._a = _a;
	}

	public Information(String ad, String soyad, String ePosta, String parola, int a, String[] emailY,String[] parolaY) {
		super();
		this._ad = ad;
		this._soyad = soyad;
		this._ePosta = ePosta;
		this._parola = parola;
		this._a = a;
		this._emailY = emailY;
		this._parolaY=parolaY;

	}

	public String get_ad() {
		return _ad;
	}

	public void set_ad(String _ad) {
		this._ad = _ad;
	}

	public String get_soyad() {
		return _soyad;
	}

	public void set_soyad(String _soyad) {
		this._soyad = _soyad;
	}

	public String get_ePosta() {
		return _ePosta;
	}

	public void set_ePosta(String _ePosta) {
		this._ePosta = _ePosta;
	}

	public String get_parola() {
		return _parola;
	}

	public void set_parola(String _parola) {
		this._parola = _parola;
	}
}
