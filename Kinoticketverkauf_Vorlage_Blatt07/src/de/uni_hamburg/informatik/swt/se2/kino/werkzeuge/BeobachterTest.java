package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeobachterTest 
{

	private BeobachterZaehler _jamesBond;
	private SubBeobachtbar _hackebeilJimmy;
	private BeobachterZaehler _sherlock;
	private SubBeobachtbar _pistolenPete;
	
	public BeobachterTest()
	{
		_jamesBond = new BeobachterZaehler();
		_sherlock = new BeobachterZaehler();
		_hackebeilJimmy = new SubBeobachtbar();
		_pistolenPete = new SubBeobachtbar();
	}
	
	@Test
	public void testZaehlfunktion()
	{
		_hackebeilJimmy.registriereBeobachter(_jamesBond);
		_hackebeilJimmy.registriereBeobachter(_sherlock);
		_pistolenPete.registriereBeobachter(_jamesBond);
		_pistolenPete.registriereBeobachter(_sherlock);
		
		assertTrue(_jamesBond.getZaehler()==0);
		assertTrue(_sherlock.getZaehler()==0);
				
		_hackebeilJimmy.informiereUeberAenderung();
		
		assertTrue(_jamesBond.getZaehler()==1);
		assertTrue(_sherlock.getZaehler()==1);
		
		_pistolenPete.informiereUeberAenderung();
		
		assertTrue(_jamesBond.getZaehler()==2);
		
		_hackebeilJimmy.informiereUeberAenderung();
		
		assertTrue(_sherlock.getZaehler()==3);
		
		
		
	}

}
