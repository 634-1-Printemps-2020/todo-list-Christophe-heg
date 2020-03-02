package test;

import metier.Status;
import metier.Tache;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tache t = new Tache("Christophe", "devoir", new Date(), Status.OPEN, false);
        System.out.println(t);
    }
}
