
public class ControllerBI
{
    

    /**
     * Constructor for objects of class ControllerBI
     */
    public ControllerBI()
    {
        
    }

    public void verknuepfenImmobilie(Besitzer bstzr, Immobilie immo)
    {
        bstzr.addImmobilie(immo);
        immo.addBesitzer(bstzr);
    }
}
