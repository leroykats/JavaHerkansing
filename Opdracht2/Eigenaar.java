
/**
 * class Eigenaar - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Eigenaar
{
    private String naam;
    private Kat kat;
    
    public Eigenaar (String naam)
    {
        this.naam = naam;
    }
    
    public String getNaam()
    {
        return this.naam;
    }
    
    public void setNaam(String naam)
    {
        this.naam = naam;
    }
    
    public void adopteerKat(Kat kat)
    {
        this.kat = kat;
    }
    
    public void Aaien()
    {
        this.kat.verhoogTevredenheidsniveau();
    }
    
    public void checkGelukkig()
    {
        this.kat.gelukkig();
    }
}
