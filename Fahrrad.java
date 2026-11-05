public class Fahrrad
{
    private String marke;
    private int gaenge;
    private boolean elektrisch;

    
    public Fahrrad()
    {
        setMarke("UNKN");
        setGaenge(0);
        setElektrisch(false);
    }

    
    public Fahrrad(String neuMarke, int neuGaenge, boolean neuElektrisch)
    {
        setMarke(neuMarke);
        setGaenge(neuGaenge);
        setElektrisch(neuElektrisch);        
        printFahrrad();
    }

    
    public String getMarke()
    {
        return marke;
    }

    public int getGaenge()
    {
        return gaenge;
    }

    public boolean getElektrisch()
    {
        return elektrisch;
    }

    
    public void setMarke(String neuMarke)
    {
        marke = neuMarke;
    }

    public void setGaenge(int neuGaenge)
    {
        if (neuGaenge >= 1 && neuGaenge <= 30)
        {
            gaenge = neuGaenge;
        }
        else
        {
            System.out.println("Fehler: Die Gänge müssen zwischen 1 und 30 liegen!");
            gaenge = 1;
        }
    }

    public void setElektrisch(boolean neuElektrisch)
    {   
        elektrisch = neuElektrisch;
    }

    
    public void printFahrrad()
    {
        if (elektrisch == true)
        {
            System.out.println("Fahrrad: " + marke + " - " + gaenge + " Gänge - elektrisch");
        }
        else
        {
            System.out.println("Fahrrad: " + marke + " - " + gaenge + " Gänge - ohne Motor");
        }
    }
}