import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FahrradTest
{
    @Test
    public void testStandardKonstruktor()
    {
        Fahrrad f = new Fahrrad();

        assertEquals("UNKN", f.getMarke());
        assertEquals(1, f.getGaenge());
        assertEquals(false, f.getElektrisch());
    }

    @Test
    public void testKonstruktor()
    {
        Fahrrad f = new Fahrrad("KTM", 27, true);

        assertEquals("KTM", f.getMarke());
        assertEquals(27, f.getGaenge());
        assertEquals(true, f.getElektrisch());
    }

    @Test
    public void testGueltigeGaenge()
    {
        Fahrrad f = new Fahrrad();

        for (int i = 1; i <= 30; i++)
        {
            f.setGaenge(i);
            assertEquals(i, f.getGaenge());
        }
    }

    @Test
    public void testZuWenigGaenge()
    {
        Fahrrad f = new Fahrrad("KTM", 0, true);

        assertEquals(1, f.getGaenge());

        f.setGaenge(-5);

        assertEquals(1, f.getGaenge());
    }

    @Test
    public void testZuVieleGaenge()
    {
        Fahrrad f = new Fahrrad("KTM", 31, true);

        assertEquals(1, f.getGaenge());

        f.setGaenge(100);

        assertEquals(1, f.getGaenge());
    }

    @Test
    public void testSetMarke()
    {
        Fahrrad f = new Fahrrad();

        f.setMarke("Cube");

        assertEquals("Cube", f.getMarke());
    }

    @Test
    public void testSetElektrisch()
    {
        Fahrrad f = new Fahrrad();

        f.setElektrisch(true);

        assertEquals(true, f.getElektrisch());

        f.setElektrisch(false);

        assertEquals(false, f.getElektrisch());
    }
}