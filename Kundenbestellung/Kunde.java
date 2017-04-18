
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
    public String printKunde()
    {
        return print("Das ist Ihr Kunde:\n"+ "Name: "+ getName() + "\nEmail: "+ getMail());
    }
    
    
    
}
