package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {
	private Innlegg[] innleggtabell;
	private int nesteLedige;

	// TODO: objektvariable
	

	public Blogg() {
		// throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		this.innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		// throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		this.innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		// throw new UnsupportedOperationException(TODO.method());
		int antall = 0;
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i] != null) {
				antall++;
			}
		}
		return antall;
	}

	public Innlegg[] getSamling() {
		// throw new UnsupportedOperationException(TODO.method());
		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		//throw new UnsupportedOperationException(TODO.method());
		int pos = 0;
		int ikke = -1;
		while ( pos<nesteLedige && ikke==-1) {
			 if (innleggtabell[pos].erLik(innlegg)) {
				 ikke=pos;
				
			 } else { 
				 return ikke;
			 }
			 pos++;
		}
		
		return pos;
		
	}

	public boolean finnes(Innlegg innlegg) {
		//throw new UnsupportedOperationException(TODO.method());
		boolean finnes = false; 
		
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				finnes = true;
				
			}
		}
		return finnes;  // skal denne her? 
			
	}

	public boolean ledigPlass() {
		//throw new UnsupportedOperationException(TODO.method());
		boolean ledig = false;
		for (Innlegg i : innleggtabell) {
			if (i == null) {
				ledig = true;
				break;
			}
		}
		return ledig;
	}

	public boolean leggTil(Innlegg innlegg) {
		//throw new UnsupportedOperationException(TODO.method());
		boolean leggTil = false;
		if(ledigPlass() || finnes(innlegg)) {
			return leggTil;
		}
		innleggtabell[nesteLedige] = innlegg;
		leggTil = true;
		nesteLedige++;
		for (Innlegg i : innleggtabell) {
			if (i == null) {
				i = innlegg;
				leggTil = true;
				break;
			}
		}
		return leggTil;
	}

	public String toString() {
		//throw new UnsupportedOperationException(TODO.method());
		String utString = "" + getAntall() + "\n";
		for (Innlegg i : innleggtabell) {
			if(i != null) {
				utString += i.toString();
			}
		}
		return utString;
	}
	/*
	 * // valgfrie oppgaver nedenfor
	 * 
	 * public void utvid() { throw new UnsupportedOperationException(TODO.method());
	 * }
	 * 
	 * public boolean leggTilUtvid(Innlegg innlegg) {
	 * 
	 * throw new UnsupportedOperationException(TODO.method());
	 * 
	 * }
	 * 
	 * public boolean slett(Innlegg innlegg) {
	 * 
	 * throw new UnsupportedOperationException(TODO.method()); }
	 * 
	 * public int[] search(String keyword) {
	 * 
	 * throw new UnsupportedOperationException(TODO.method());
	 * 
	 * }
	 */
}