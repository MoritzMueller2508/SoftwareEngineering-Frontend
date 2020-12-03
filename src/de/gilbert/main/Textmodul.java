package de.gilbert.main;

/**
 * @author Lukas Rothenbach
 */
public abstract class Textmodul extends Modul{
	private String text;
	
	public Textmodul(String[] schluessel, String text) {
		super(schluessel);
		this.text = text;
	}

	public void beantworteAnfrage(Anfrage anfrage) {
		anfrage.schreibeAntwort(text);
	}
	
	public String getText() {
		return text;
	}

}
