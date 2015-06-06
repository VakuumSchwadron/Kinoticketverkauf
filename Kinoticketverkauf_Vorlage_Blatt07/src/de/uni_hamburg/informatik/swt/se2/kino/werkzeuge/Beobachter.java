package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

/**
 * Beobachter-Interface, um Änderungen eines Objekts vom Typ Beobachtbar
 * registrieren zu können
 * 
 * @author VakuumSchwadron
 * @version SoSe 2015
 *
 */
public interface Beobachter

{
	/**
	 * Wenn sich der Zustand in einer beobachteten Klasse ändert, wird diese Methode aufgerufen
	 * und die veränderte Klasse als Parameter übergeben. Diese Operation beinhaltet die Reaktion
	 * der implementierenden Klasse auf die Änderungen.
	 *  
	 * 
	 * @param o Das beobachtete Objekt, in dem eine Änderung stattgefunden hat.
	 * 
	 * @require (o != null)
	 * @require (o instanceof Beobachtbar)
	 */
    public void reagiereAufAenderung(Object o);
}
