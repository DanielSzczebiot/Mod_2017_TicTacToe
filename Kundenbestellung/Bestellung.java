public class Bestellung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String datum;
    private String artikel;
    private int anzahl;
    private double betrag;
    private Kunde gehoert; 
    /**
     * Konstruktor für Objekte der Klasse Bestellung
     */
    public Bestellung()
    {
        datum = "";
        artikel ="";
        anzahl = 0;
        betrag = 0;
    }

    public String getDatum()
    {
        return this.datum;
    }
    
    public void setDatum(String dat)
    {
        this.datum = dat;
    }
    
    public String getArtikel()
    {
        return this.artikel;
    }
    
    public void setArtikel(String art)
    {
        this.artikel = art;
    }
    
    public int getAnzahl()
    {
        return this.anzahl;
    }
    
    public void setAnzahl(int anz)
    {
        this.anzahl = anz;
    }
    
    public double getBetrag()
    {
        return this.betrag;
    }
    
    public void setBetrag(double betr)
    {
        this.betrag = betr;
    }
    
    public void addArticle(String name, int anz, double preis)
    {
        if(this.anzahl > 0)
        {
        setArtikel(getArtikel() +"\n"+anz+"x "+ name);
        setAnzahl(getAnzahl() + anz);
        setBetrag(getBetrag() + preis*anz);
        }
    else {
        setArtikel(anz+"x "+name);
        setAnzahl(getAnzahl() + anz);
        setBetrag(getBetrag() + preis*anz);
         }
    }
    
    public String getKunde()
    { 
        return this.gehoert.getName();
    }
    
    public void setKunde(Kunde k)
    {
        this.gehoert = k;
    }
    
    public void testprint()
    {
        System.out.println("Bestellung vom: " + getDatum());
        System.out.println(this.artikel);
        System.out.println("Anzahl Artikel: " + getAnzahl());
        System.out.printf("Gesamtbetrag: %.2f",getBetrag());
    }
}
