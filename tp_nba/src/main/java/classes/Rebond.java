/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import annotations.AnnotationClass;
import annotations.AnnotationField;
import static dao.Dao.dao;

/**
 *
 * @author USER
 */
@AnnotationClass(table = "Rebond")
public class Rebond {
    @AnnotationField(attribut = "id")
    int id;
    @AnnotationField(attribut = "idMatch")
    int idMatch;
    @AnnotationField(attribut = "idJoueur")
    int idJoueur;
    @AnnotationField(attribut = "nombre")
    int nombre;
    @AnnotationField(attribut = "typeRebond")
    String typeRebond;
    
    public Rebond() {
    }

    public Rebond(int idMatch, int idJoueur, int nombre, String typeRebond) {
        this.idMatch = idMatch;
        this.idJoueur = idJoueur;
        this.nombre = nombre;
        this.typeRebond = typeRebond;
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

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getTypeRebond() {
        return typeRebond;
    }

    public void setTypeRebond(String typeRebond) {
        this.typeRebond = typeRebond;
    }

    public Rebond insertRebond(String idMatch, String idJoueur, String nombre, String typeRebond) throws Exception {
        Rebond rebond = null;
        int idM = 0;
        int idJ = 0;
        int nbrRebond = 0;
        if(idMatch!="" && idJoueur!="" && nombre!="" && typeRebond!="") {
            idM = Integer.parseInt(idMatch);
            idJ = Integer.parseInt(idJoueur);
            nbrRebond = Integer.parseInt(nombre);
            rebond = new Rebond(idM, idJ, nbrRebond, typeRebond);
            dao().insert(rebond, null);
        }
        return rebond;
    }
}
