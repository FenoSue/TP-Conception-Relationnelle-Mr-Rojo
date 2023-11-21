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
@AnnotationClass(table = "Match")
public class Match {
    @AnnotationField(attribut = "id")
    int id;
    @AnnotationField(attribut = "idEquipe1")
    int idEquipe1;
    @AnnotationField(attribut = "idEquipe2")
    int idEquipe2;
    @AnnotationField(attribut = "dateMatch")
    Date dateMatch;
    @AnnotationField(attribut = "duree")
    int duree;

    public Match() {
    }

    public Match(int idEquipe1, int idEquipe2, Date dateMatch, int duree) {
        this.idEquipe1 = idEquipe1;
        this.idEquipe2 = idEquipe2;
        this.dateMatch = dateMatch;
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEquipe1() {
        return idEquipe1;
    }

    public void setIdEquipe1(int idEquipe1) {
        this.idEquipe1 = idEquipe1;
    }

    public int getIdEquipe2() {
        return idEquipe2;
    }

    public void setIdEquipe2(int idEquipe2) {
        this.idEquipe2 = idEquipe2;
    }

    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
    
}
