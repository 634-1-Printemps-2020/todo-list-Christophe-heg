package metier;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class TacheTest {


    @Test
    public void creerTache() throws TacheException, Exception{
        Tache t = new Tache("Christophe", "test", new Date(), Status.OPEN, false);
        Assert.assertEquals(t, t.getTache());
    }

    @Test
    public void annulerTache() throws TacheException {
        Tache t = new Tache("Christophe", "test", new Date(), Status.OPEN, false);
        t.annulerTache();
        Assert.assertEquals(Status.CANCELED, t.getStatus());
    }

    @Test
    public void replanifierTache() throws TacheException, Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date d = dateFormat.parse("02.03.2020");

        Tache t = new Tache("Christophe", "test", d, Status.OPEN, false);
        Date da = dateFormat.parse("02.03.2020");
        t.replanifierTache("Christophe", da);
        Assert.assertEquals(da, t.getDate());
    }
}