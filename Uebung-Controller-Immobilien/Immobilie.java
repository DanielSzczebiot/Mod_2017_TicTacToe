import java.util.*;
/**
 * Write a description of class Immobilie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Immobilie
{
    private static int nummer = 1;
    // instance variables - replace the example below with your own
    private int id;
    private String ort;
    private Typ typ;
    private Lage lage;
    private int preis;  
    
    // private ArrayList<Besitzer> besitzerListe = new ArrayList<Besitzer>();
    private ArrayList<Besitzer> besitzerListe;
    

    /**
     * Constructor for objects of class Immobilie
     */
    public Immobilie()
    {
        // initialise instance variables
        this.ort = "Haltern";
        this.typ = Typ.EFH;
        this.lage = Lage.ZENTRAL;
        this.preis = 225000;
        
        id = nummer;
        nummer++;
        besitzerListe = new ArrayList<Besitzer>();
    }

    /**
     * Constructor for objects of class Immobilie
     */
    public Immobilie(String ort, Typ typ, Lage lage, int preis)
    {
        // initialise instance variables
        this.ort = ort;
        this.typ = typ;
        this.lage = lage;
        this.preis = preis;
        
        id = nummer;
        nummer++;
        besitzerListe = new ArrayList<Besitzer>();
    }
    
    public void printImmobilie() {
        System.out.println(this.getClass().getName() + " : " + this.toString() + " -> printImmobilie() " );
        System.out.println(" id: " + this.id + "\n" +
                           " ort: " + this.ort +  "\n" +
                           " typ : " + this.typ + "\n" +
                           " lage : " + this.lage + "\n" +
                           " preis : " + this.preis 
                           );
   }
   
    public void printBesitzerListe() {
        System.out.println("\n" + this.getClass().getName() + " : " + this.toString() + " -> printbesitzerListe() ...");
        Iterator it = besitzerListe.iterator();
        while(it.hasNext()) {
            ((Besitzer) it.next()).printBesitzer();
        }
    }
   
    public void addBesitzer() {
        besitzerListe.add(new Besitzer());
    }
    
    public void addBesitzer(Besitzer besitzer) {
        besitzerListe.add(besitzer);
    }

    public ArrayList <Besitzer> getBesitzerListe() {
        return besitzerListe;
    }

   public void deleteBesitzer(Besitzer besitzer) {
        if(besitzerListe.contains(besitzer))
            besitzerListe.remove(besitzer);
        else
            System.out.println("Fehler: Es gibt keinen besitzerListe von diesem Typ mehr" + besitzerListe.toString());
    }
    

}
