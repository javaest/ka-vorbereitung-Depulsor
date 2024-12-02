package vorlage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bestellung {
    public int bestellnummer;
    public Date bestelldatum;
    private List<Gericht> gerichte;
    private Kunde kunde;
    private Kellner kellner;
    private double gesamtbetrag;

    // Konstruktor, Getter und Setter

    public double getGesamtbetrag() {
 
		return gesamtbetrag;
	}

	public void gerichtHinzufuegen(Gericht gericht) {
  
    }

    public void gesamtbetragBerechnen() {
   
    }
    
    public List<Gericht> getGerichte() {
    	return gerichte;
    }
    
    public Kellner getKellner() {
    	return kellner;
    }
    
    public Kunde getKunde() {
    	return kunde;
    }

	public Bestellung(int bestellnummer, Date bestelldatum, Kunde kunde, Kellner kellner) {
		super();
		this.bestellnummer = bestellnummer;
		this.bestelldatum = bestelldatum;
		this.gerichte = new ArrayList<Gericht>();
		this.kunde = kunde;
		this.kellner = kellner;
	}
}