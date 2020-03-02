package metier;

import java.util.Date;

public interface ITache {

    void creerTache(String createur, String description, Date date, Status status, boolean resolution) throws TacheException;
    void annulerTache();
    void replanifierTache(String createur, Date date);
    Tache consuterTache();
    void consulterTacheAutre(String createur);
}
