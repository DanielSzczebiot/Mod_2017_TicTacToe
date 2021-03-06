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
    private Bestellung[] bestellung = new Bestellung[50];
    private int anzahlBestellungen = 0;
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
        anzahlBestellungen += 1;
        Bestellung temp = new Bestellung();
        temp.setGehoert(this);
        System.out.println("Geben Sie das Datum Ihrer Bestellung ein: ");
        String x;
        int y,i = 1;
        double z;
        x = scan.next();
        temp.setDatum(x);
        while(i!=0)
        {
        System.out.println("Geben Sie den zu bestellenden Artikel ein: ");
        x = scan.next();
        System.out.println("Geben Sie die Anzahl dieses Artikels ein: ");
        y = scan.nextInt();
        System.out.println("Geben Sie den Einzelpreis des Artikels ein: ");
        z = scan.nextDouble();
        
       temp.addArticle(x,y,z);
       System.out.println("mehr? 0 fuer nein eingeben");
       i = scan.nextInt();
      }
      bestellung[anzahlBestellungen] = temp;
      bestellung[anzahlBestellungen].testprint();
    }
    public void printBestellungen()
    {
        System.out.println("Welche Bestellung soll angezeigt werden?");
        int i;
        for(i=1;i<=anzahlBestellungen;i++)
        {
            System.out.printf("%d\n",i);
        }
        i = scan.nextInt();
        bestellung[i].testprint();
    }
    
}
