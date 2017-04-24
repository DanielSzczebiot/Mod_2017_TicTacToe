import java.util.*;
/**
 * Write a description of class Besitzer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Besitzer
{
	
    private static int nummer = 1;
    
    // instance variables - replace the example below with your own
    private int id ;
    private String name;
    private String email;
    // private ArrayList<Immobilie> immobilien = new ArrayList<Immobilie>();
    private ArrayList<Immobilie> immobilien;
    
    /**
     * Constructor for objects of class Interessent
     */
    public Besitzer()
    {
        // initialise instance variables
        this.name = "Bodo Gierig";
        this.email = "gierig@dot.com";
        id = nummer;
        nummer++;
        immobilien = new ArrayList<Immobilie>();

    }

    /**
     * Constructor for objects of class Besitzer
     */
    public Besitzer(String name, String email)
    {
        // initialise instance variables
        this.name = name;
        this.email = email;
        id = nummer;
        nummer++;
        immobilien = new ArrayList<Immobilie>();
    }

    public void printBesitzer() {
        System.out.println(this.getClass().getName() + " : " + this.toString() + " -> printBesitzer() " );
        System.out.println( 
                           " id: " + this.id + "\n" +
                           " name: " + this.name +  "\n" +
                           " email : " + email
                           );
   }

   public void printImmobilien() {
        System.out.println("\n" + this.getClass().getName() + " : " + this.toString() + " -> printImmobilien() ...");
        System.out.println("Name : " + this.name );
        
        Iterator it = immobilien.iterator();
        while(it.hasNext()) {
            ((Immobilie) it.next()).printImmobilie();
        }
    }
    
   
   
    public void addImmobilie() {
          immobilien.add(new Immobilie());
    }

    public void addImmobilie(Immobilie immobilie) {
          immobilien.add(immobilie);
    }

    public ArrayList<Immobilie> getImmobilien() {
        return immobilien;
    }
    
    public void deleteImmobilie(Immobilie immobilie) {
        if(immobilien.contains(immobilie))
            immobilien.remove(immobilie);
        else
            System.out.println("Fehler: Es gibt keine Immobilie von diesem Typ mehr" + immobilien.toString());
    }
    
    public String getName()    {
        return name;
    }

    public String getEmail()    {
        return email;
    }

    
    
}
