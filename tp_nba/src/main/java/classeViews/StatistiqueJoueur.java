/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeViews;

import annotations.AnnotationClass;
import annotations.AnnotationField;
import static dao.Dao.dao;

/**
 *
 * @author USER
 */
@AnnotationClass(table = "StatistiqueJoueur")
public class StatistiqueJoueur {
    @AnnotationField(attribut = "idJoueur")
    int idJoueur;
    @AnnotationField(attribut = "nom")
    String nom;
    @AnnotationField(attribut = "nombreRebond")
    int nombreRebond;
    @AnnotationField(attribut = "nombrePoint")
    int nombrePoint;
    @AnnotationField(attribut = "dureeSurTerrain")
    int dureeSurTerrain;

    public StatistiqueJoueur() {
    }

    public StatistiqueJoueur(int idJoueur, String nom, int nombreRebond, int nombrePoint, int dureeSurTerrain) {
        this.idJoueur = idJoueur;
        this.nom = nom;
        this.nombreRebond = nombreRebond;
        this.nombrePoint = nombrePoint;
        this.dureeSurTerrain = dureeSurTerrain;
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreRebond() {
        return nombreRebond;
    }

    public void setNombreRebond(int nombreRebond) {
        this.nombreRebond = nombreRebond;
    }

    public int getNombrePoint() {
        return nombrePoint;
    }

    public void setNombrePoint(int nombrePoint) {
        this.nombrePoint = nombrePoint;
    }

    public int getDureeSurTerrain() {
        return dureeSurTerrain;
    }

    public void setDureeSurTerrain(int dureeSurTerrain) {
        this.dureeSurTerrain = dureeSurTerrain;
    }
    
    public StatistiqueJoueur[] getStatistiqueJoueur(String idJoueur) throws Exception {
        StatistiqueJoueur[] liste = null;
        Object[] objet = null;
        int idJ = 0;
        int i=0;
        if(idJoueur!="") {
            idJ = Integer.parseInt(idJoueur);
            try {
                StatistiqueJoueur statJoueur = new StatistiqueJoueur();
                statJoueur.setIdJoueur(idJ);
                objet = dao().select(statJoueur, null);
                liste = new StatistiqueJoueur[objet.length];
                for(i=0; i<liste.length; i++) {
                    liste[i] = (StatistiqueJoueur) objet[i];
                }
            }
            catch(Exception ex) {
                throw ex;
            }
        }
        return liste;
    }
}
