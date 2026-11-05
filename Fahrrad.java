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
        gaenge = neuGaenge;
    }

    public void setElektrisch(boolean neuElektrisch)
    {
        elektrisch = neuElektrisch;
    }

    
    public void printFahrrad()
    {
        System.out.println(marke + " Fahrrad: " + gaenge + " Gaenge - " + elektrisch);
    }
}