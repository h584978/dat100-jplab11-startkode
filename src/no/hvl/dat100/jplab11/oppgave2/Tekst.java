package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	private String Tekst;
	private String url;

	
	public String getUrl() {
		return url;
	}

	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		this.Tekst=tekst;
		setLikes(0);
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		setId(id);
		setBruker(bruker);
		setDato(dato);
		this.Tekst=tekst;
		setLikes(likes);
	}
	
	public String getTekst() {
		return Tekst;

	}

	public void setTekst(String tekst) {
		this.Tekst = tekst;
	}

	@Override
	public String toString() {
		return "TEKST\n" 
				+ getId() 
					+ "\n" + getBruker()
						+ "\n" + getDato() 
							+ "\n" + getLikes() 
									+ "\n" + getTekst()
										+ "\n" + getUrl() + "\n";
		}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
