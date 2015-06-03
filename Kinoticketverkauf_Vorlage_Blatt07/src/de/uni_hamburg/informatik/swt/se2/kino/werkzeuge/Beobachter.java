package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

/**
 * Beobachter-Interface, um Änderungen registrieren zu können
 * 
 * @author VakuumSchwadron
 * @version SoSe 2015
 *
 */
public interface Beobachter

{
	/**
	 * Reagiert auf Aenderungen der beobachteten Klasse
	 * 
	 * @param o Die beobachtete Klasse
	 * 
	 * @require (o != null)
	 */
    public void reagiereAufAenderung(Object o);
}
