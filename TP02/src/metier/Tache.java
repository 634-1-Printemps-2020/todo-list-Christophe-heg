package metier;

import java.util.Date;

public class Tache implements ITache{

    private String createur;
    private String description;
    private Date date;
    private Status status;
    private boolean resolution;

    public Tache(String createur, String description, Date date, Status status, boolean resolution) {
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = status;
        this.resolution = resolution;
    }

    @Override
    public void creerTache(String createur, String description, Date date, Status status, boolean resolution) {
        new Tache(createur, description, date, status, resolution);
    }

    @Override
    public void annulerTache() {
        this.status = Status.CANCELED;
    }

    @Override
    public void replanifierTache(String createur, String description, Date date, Status status, boolean resolution) {
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = status;
        this.resolution = resolution;
    }

    @Override
    public Tache consuterTache() {
       return
    }

    @Override
    public Tache consulterTacheAutre(String createur) {

    }
}
