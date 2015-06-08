package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

/**
 * Diese Klasse implementiert das Interface Beobachter und zählt die Aufrufe der
 * Methode reagiereAufAenderung(Object o). 
 * 
 * @author VakuumSchwadron
 * @ version SoSe15
 *
 */

public class BeobachterZaehler implements Beobachter
{
	private int _zaehler = 0;

	@Override
	public void reagiereAufAenderung(Object o)
	{
		assert o != null : "Vorbedingung verletzt: o != null";
		assert o instanceof Beobachtbar : "Vorbedingung verletzt";
		
		_zaehler +=1;
		
		
	}
	
	/**
	 * Gibt die Anzahl an Methodenaufrufen von reagiereAufAenderung zurück
	 * 
	 * @return Anzahl der Methodenaufrufe
	 */
	public int getZaehler()
	{
		return _zaehler;
	}
	
}
