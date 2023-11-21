/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import annotations.AnnotationClass;
import annotations.AnnotationField;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author USER
 */
@AnnotationClass(table = "Classement")
public class Classement {
    @AnnotationField(attribut = "id")
    int id;
    @AnnotationField(attribut = "idMatch")
    int idMatch;
    @AnnotationField(attribut = "idEquipe")
    int idEquipe;
    @AnnotationField(attribut = "idStatistique")
    int idStatistique;

    public Classement() {
    }

    public Classement(int idMatch, int idEquipe, int idStatistique) {
        this.idMatch = idMatch;
        this.idEquipe = idEquipe;
        this.idStatistique = idStatistique;
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

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public int getIdStatistique() {
        return idStatistique;
    }

    public void setIdStatistique(int idStatistique) {
        this.idStatistique = idStatistique;
    }
}
