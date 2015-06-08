package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

public class BeobachterZaehler implements Beobachter
{
	private int _zaehler;
	
	public BeobachterZaehler()
	{
		_zaehler = 0;
		
	}

	public void reagiereAufAenderung(Object o)
	{
		assert o != null : "Vorbedingung verletzt: o != null";
		assert o instanceof Beobachtbar : "Vorbedingung verletzt";
		
		_zaehler +=1;
		
		
	}
	public int getZaehler()
	{
		return _zaehler;
	}
	
}
