package metier;

import java.util.Date;

public class Tache implements ITache{

    private String createur;
    private String description;
    private Date date;
    private Status status;
    private boolean resolution;

    public Tache(String createur, String description, Date date, Status status, boolean resolution) throws TacheException{

        if(new Date().compareTo(date) < 0 ){
            throw new TacheException("La date ne peut pas etre plus petite que la date du jour");
        }
        this.createur = createur;
        this.description = description;
        this.date = date;
        this.status = status;
        this.resolution = resolution;
    }

    @Override
    public void creerTache(String createur, String description, Date date, Status status, boolean resolution) throws TacheException{
        new Tache(createur, description, date, status, resolution);
    }

    @Override
    public void annulerTache() {
        this.status = Status.CANCELED;
    }

    @Override
    public void replanifierTache(String createur, Date date) {
        this.createur = createur;
        this.date = date;
    }

    @Override
    public Tache consuterTache() {
        return this;
    }

    @Override
    public void consulterTacheAutre(String createur) {

    }

    public Tache getTache(){
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }
}
