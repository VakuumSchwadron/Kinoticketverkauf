package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse liefert die Funktionalität für beobachtbare Klassen. Definiert Operationen zum An- und
 * Abmelden von Beobachtern.
 * 
 * @author VakuumSchwadron
 * @version SoSe 2015
 */
public abstract class Beobachtbar
{

    /**
     * Die Liste der registrierten Beobachter.
     */
    private List<Beobachter> _beobachter;

    /**
     * Initialisiert die Klasse Beobachtbar.
     */
    public Beobachtbar()
    {
        _beobachter = new ArrayList<Beobachter>();
    }
    
    
    /**
     * Meldet den gegebenen Beoabachter beim zu beobachteten Objekt an.
     * 
     * @param beobachter Ein Beobachter, der angemeldet werden soll.
     * 
     * @require beobachter != null
     */
    public void registriereBeobachter(Beobachter beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        
        if (!_beobachter.contains(beobachter))
        {
            _beobachter.add(beobachter);
        }
    }
    
    
    /**
     * Meldet den gegebenen Beoabachter ab.
     * 
     * @param beobachter Ein Beobachter, der abgemeldet werden soll.
     * 
     * @require beobachter != null
     */
    public void entferneBeobachter(Beobachter beobachter)
    {
        assert beobachter != null : "Vorbedingung verletzt: beobachter != null";
        
        _beobachter.remove(beobachter);
    }

    /**
     * Informiert alle angemeldeten Beobachter, dass eine relevante Änderung
     * eingetreten ist.
     */
    protected void informiereUeberAenderung()
    {
        for (Beobachter beobachter : _beobachter)
        {
            beobachter.reagiereAufAenderung(this);
        }
    }
}
