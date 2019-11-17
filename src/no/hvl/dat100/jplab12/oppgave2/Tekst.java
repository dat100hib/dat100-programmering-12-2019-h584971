package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	
	private String tekst; 
	public Tekst () {
	}
		
	
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
		super(id, bruker, dato);
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
		super(id, bruker, dato, likes);
		this.tekst = tekst;
	}
	
	public String getTekst() {
		//throw new UnsupportedOperationException(TODO.method());
		 return tekst;
	}

	public void setTekst(String tekst) {
		//throw new UnsupportedOperationException(TODO.method());
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		//throw new UnsupportedOperationException(TODO.method());
		  return "TEKST" + "\n" + super.getId() + "\n" + super.getBruker() + "\n" + super.getDato() + "\n"	+ super.getLikes() + "\n" + getTekst() + "\n";
		  
		  // kan bruke super.toString for å slippe å skrive super og for å kunne fylle på senere, se toString  
		
	}
	/*
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
	*/
}
