package metier;

import java.util.Date;

public interface ITache {

    void creerTache(String createur, String description, Date date, Status status, boolean resolution);
    void annulerTache();
    void replanifierTache(String createur, String description, Date date, Status status, boolean resolution);
    Tache consuterTache();
    Tache consulterTacheAutre(String createur);
}
