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
@AnnotationClass(table = "Equipe")
public class Equipe {
    @AnnotationField(attribut = "id")
    int id;
    @AnnotationField(attribut = "nom")
    String nom;
    @AnnotationField(attribut = "nombreJoueur")
    int nombreJoueur;

    public Equipe() {
    }

    public Equipe(String nom, int nombreJoueur) {
        this.nom = nom;
        this.nombreJoueur = nombreJoueur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreJoueur() {
        return nombreJoueur;
    }

    public void setNombreJoueur(int nombreJoueur) {
        this.nombreJoueur = nombreJoueur;
    }
    
    public Equipe[] listeEquipe() throws Exception {
        Equipe[] equipe = null;
        Object[] objet = null;
        int i=0;
        try {
            objet = dao().select(this, null);
            equipe = new Equipe[objet.length];
            for(i=0; i<objet.length; i++) {
                equipe[i] = (Equipe) objet[i];
            }
        }
        catch(Exception ex) {
            throw ex;
        }
        return equipe;
    }
}
