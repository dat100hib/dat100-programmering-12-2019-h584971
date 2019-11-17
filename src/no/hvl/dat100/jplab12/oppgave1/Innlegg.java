package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	private int id; 
	private String bruker;
	private String dato;
	
	private int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg")); check 
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
	

		// TODO - START
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg")); mulig check 
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		//throw new UnsupportedOperationException(TODO.method());
		return bruker;
	}

	public void setBruker(String bruker) {
		//throw new UnsupportedOperationException(TODO.method());
		this.bruker = bruker;
	}

	public String getDato() {
		//throw new UnsupportedOperationException(TODO.method());
		return dato;
		
	}

	public void setDato(String dato) {
		//throw new UnsupportedOperationException(TODO.method());
		this.dato = dato;
	}

	public int getId() {
		//throw new UnsupportedOperationException(TODO.method());
		return id;
	}

	public int getLikes() {
		//throw new UnsupportedOperationException(TODO.method());
		return likes;
	}
	
	public void doLike () {
	//	throw new UnsupportedOperationException(TODO.method());
		this.likes++;
		
	}
	
	public boolean erLik(Innlegg innlegg) {
		//throw new UnsupportedOperationException(TODO.method());  
			
			// 3 hovedtilfeller, peker de til samme objekt?, hvis det ikke er en innleggg er de ikke her. 
			boolean funnet = false;
			
			if (this.id == innlegg.getId()) {
				funnet = true;
			}
			return funnet;
			
			
		
		
	}
	
	@Override
	public String toString() {
		//throw new UnsupportedOperationException(TODO.method());
				
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
	}
	
	/*// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
	*/
}
