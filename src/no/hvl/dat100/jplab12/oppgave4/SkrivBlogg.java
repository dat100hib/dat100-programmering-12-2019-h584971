package no.hvl.dat100.jplab12.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {

		//throw new UnsupportedOperationException(TODO.method());
		boolean printOut = true;
		PrintWriter writer;		
		try 
		{
			File file = new File(MAPPE + filnavn);
		writer = new PrintWriter(file); 
		
		writer.println(samling.toString());
		
		writer.close();
	}
	 catch (FileNotFoundException e) 
		{
		 printOut = false;
		 JOptionPane.showMessageDialog(null, "File " + filnavn + " doesn't exist " + e.getMessage());
		}
		return printOut;
	}
}