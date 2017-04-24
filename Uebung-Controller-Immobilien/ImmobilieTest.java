

/**
 * The test class ImmobilieTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ImmobilieTest extends junit.framework.TestCase
{
	private Besitzer bodoGierig;
	private Besitzer drWichtig;
	private Besitzer elfriedeGeizig;
	private Immobilie efhHaltern;
	private Immobilie efhBochum;
	private Immobilie penthouseHamburg;

    /**
     * Default constructor for test class ImmobilieTest
     */
    public ImmobilieTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
		bodoGierig = new Besitzer();
		drWichtig = new Besitzer("Dr. Wichtig", "wichtig@mydot.com");
		elfriedeGeizig = new Besitzer("Elfriede Geizig", "eg@geizkragen.de");
		efhHaltern = new Immobilie();
		efhBochum = new Immobilie("Bochum", Typ.EFH, Lage.STADTRAND, 275000);
		penthouseHamburg = new Immobilie("Hamburg", Typ.PENTHOUSE, Lage.ZENTRAL, 650000);
		bodoGierig.addImmobilie(efhHaltern);
		bodoGierig.addImmobilie(efhBochum);
		bodoGierig.addImmobilie(penthouseHamburg);
		drWichtig.addImmobilie(penthouseHamburg);
		elfriedeGeizig.addImmobilie(penthouseHamburg);
		penthouseHamburg.addBesitzer(bodoGierig);
		penthouseHamburg.addBesitzer(drWichtig);
		penthouseHamburg.addBesitzer(elfriedeGeizig);
		efhBochum.addBesitzer(bodoGierig);
		efhHaltern.addBesitzer(bodoGierig);
		bodoGierig.printImmobilien();
		drWichtig.printImmobilien();
		elfriedeGeizig.printImmobilien();
		bodoGierig.printImmobilien();
		drWichtig.printImmobilien();
		elfriedeGeizig.printImmobilien();
		penthouseHamburg.printBesitzerListe();
		efhBochum.printBesitzerListe();
		efhHaltern.printBesitzerListe();
	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
}
