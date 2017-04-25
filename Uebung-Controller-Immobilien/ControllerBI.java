
public class ControllerBI
{
    

    /**
     * Constructor for objects of class ControllerBI
     */
    public ControllerBI()
    {
        
    }

    public void BI_Connector(Besitzer bstzr, Immobilie immo)
    {
        bstzr.addImmobilie(immo);
        immo.addBesitzer(bstzr);
    }
    
    public void BI_Disconnector(Besitzer bstzr, Immobilie immo)
    {
        bstzr.deleteImmobilie(immo);
        immo.deleteBesitzer(bstzr);
    }
}
