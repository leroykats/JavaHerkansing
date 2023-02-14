
/**
 * class Kat - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class Kat
{
    private String naam;
    private double tevredenheidsniveau;
    
    public Kat (String naam)
    {
        this.naam = naam;
        double tevredenheidsniveau = 0;
    }
    
    public String getNaam()
    {
        return this.naam;
    }
    
    public void setNaam(String naam)
    {
        this.naam = naam;
    }
    
    public double getTevredenheidsniveau()
    {
        return this.tevredenheidsniveau;
    }
    
    public void verhoogTevredenheidsniveau()
    {
        if(this.tevredenheidsniveau < 5.0)
        {
            this.tevredenheidsniveau = tevredenheidsniveau + 0.3;
        }
        else
        {
            this.tevredenheidsniveau = 5.0;
        }
    }
}
