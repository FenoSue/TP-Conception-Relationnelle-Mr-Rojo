/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import annotations.AnnotationClass;
import annotations.AnnotationField;
import static dao.Dao.dao;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author USER
 */
@AnnotationClass(table = "Statistique")
public class Statistique {
    @AnnotationField(attribut = "id")
    int id;
    @AnnotationField(attribut = "idMatch")
    int idMatch;
    @AnnotationField(attribut = "idJoueur")
    int idJoueur;
    @AnnotationField(attribut = "point")
    int point;
    @AnnotationField(attribut = "minutes")
    int minutes;

    public Statistique() {
    }

    public Statistique(int idMatch, int idJoueur, int point, int minutes) {
        this.idMatch = idMatch;
        this.idJoueur = idJoueur;
        this.point = point;
        this.minutes = minutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Statistique insertStat(String idMatch, String idJoueur, String points, String minutes) throws Exception {
        Statistique stat = null;
        int idM = 0, idJ = 0, point = 0, min = 0;
        if(idMatch!="" && idJoueur!="" && points!="" && minutes!="") {
            idM = Integer.parseInt(idMatch);
            idJ = Integer.parseInt(idJoueur);
            point = Integer.parseInt(points);
            min = Integer.parseInt(minutes);
            stat = new Statistique(idM, idJ, point, min);
            dao().insert(stat, null);
        }
        return stat;
    }
}
