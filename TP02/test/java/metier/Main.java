package metier;

import metier.Status;
import metier.Tache;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws TacheException, Exception{
        testTache();
    }

    private static void testTache() throws Exception{
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date d = dateFormat.parse("01.03.2020");

            Tache t = new Tache("Christophe", "devoir", d, Status.OPEN, false);

            System.out.println("test1 OK");
        } catch (TacheException e) {
            System.out.println("test1 NOK");
        }




    }
}
