import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Kunde.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kunde
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int id;
    private String name;
    private String email;
    private ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
    //private Bestellung[] bestellung = new Bestellung[5];
    //private int anzahlBestellungen = 0;
    Scanner scan = new Scanner(System.in);

    /**
     * Konstruktor für Objekte der Klasse Kunde
     */
    public Kunde()
    {
        // Instanzvariable initialisieren
        id = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    
    
    public String getName()
    {
        // tragen Sie hier den Code ein
        return name;
    }
    public void setName(String name)
    {
        // tragen Sie hier den Code ein
        this.name = name;
    }
     public String getMail()
    {
        // tragen Sie hier den Code ein
        return email;
    }
     public void setMail(String email)
    {
        // tragen Sie hier den Code ein
        this.email = email;
    }
    public void printKunde()
    {
         System.out.print("Das ist Ihr Kunde:\n"+ "Name: "+ getName() + "\nEmail: "+ getMail());
    }
    public void neueBestellung()
    {
        /*
        anzahlBestellungen += 1;
        
        System.out.println("Geben Sie das Datum Ihrer Bestellung ein: ");
        String x;
        x = scan.next();
        */
       Bestellung bestellung1 = new Bestellung();
       bestellung1.setDatum("18.04.2017");
       
       // bestellung[1].setDatum("18.04.2017");
        System.out.println("Eingegebenes Datum: " + bestellung1.getDatum());
       bestellung1.addArticle("Kugelschreiber",5,2.95);
       bestellung1.addArticle("Schreibblock",2,0.95);
       bestellung1.addArticle("Geodreieck",1,1.00);
       
       bestellung1.testprint();
    }
    
    
}
