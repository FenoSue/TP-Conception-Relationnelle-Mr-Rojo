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
@AnnotationClass(table = "PasseTir")
public class PasseTir {
    @AnnotationField(attribut = "id")
    int id;
    @AnnotationField(attribut = "idMatch")
    int idMatch;
    @AnnotationField(attribut = "idJoueur")
    int idJoueur;
    @AnnotationField(attribut = "nombre")
    int nombre;
    @AnnotationField(attribut = "types")
    int types;

    public PasseTir() {
    }

    public PasseTir(int idMatch, int idJoueur, int nombre, int types) {
        this.idMatch = idMatch;
        this.idJoueur = idJoueur;
        this.nombre = nombre;
        this.types = types;
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

    public int getTypes() {
        return types;
    }

    public void setTypes(int types) {
        this.types = types;
    }
    
    public PasseTir insertPasseTir(String idMatch, String idJoueur, String nombre, String types) throws Exception {
        PasseTir pass = null;
        int idM = 0;
        int idJ = 0;
        int nbr = 0;
        int type = 0;
        if(idMatch!="" && idJoueur!="" && nombre!="" && types!="") {
            idM = Integer.parseInt(idMatch);
            idJ = Integer.parseInt(idJoueur);
            nbr = Integer.parseInt(nombre);
            type = Integer.parseInt(types);
            pass = new PasseTir(idM, idJ, nbr, type);
            dao().insert(pass, null);
        }
        return pass;
    }
}
