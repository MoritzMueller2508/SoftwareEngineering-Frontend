package de.gilbert.main;

import java.net.URL;

public abstract class Verweismodul extends Modul {
	private URL verweis;
	private String platzhalter;
	
	public Verweismodul(URL link, String platzhalter) {
		this.verweis = link;
		this.platzhalter = platzhalter;
	}
	
	//TODO: implement
	public void beantworteAnfrage(Anfrage anfrage) {
		
	}
	
	public URL getVerweis() {
		return verweis;
	}
	
	public String getPlatzhalter() {
		return platzhalter;
	}
	
	@Override
	public String[] getSchluessel() {
		return super.getSchluessel();
	}
}
