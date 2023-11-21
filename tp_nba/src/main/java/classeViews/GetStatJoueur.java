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
@AnnotationClass(table = "GetStatJoueur")
public class GetStatJoueur {
    @AnnotationField(attribut = "idEquipe")
    int idEquipe;
    @AnnotationField(attribut = "equipe")
    String equipe;
    @AnnotationField(attribut = "idJoueur")
    int idJoueur;
    @AnnotationField(attribut = "joueur")
    String joueur;
    @AnnotationField(attribut = "nombreRebond")
    int nombreRebond;
    @AnnotationField(attribut = "nombrePoint")
    int nombrePoint;
    @AnnotationField(attribut = "nombrePasse")
    int nombrePasse;
    @AnnotationField(attribut = "nombreTir")
    int nombreTir;
    @AnnotationField(attribut = "dureeSurTerrain")
    int dureeSurTerrain;

    public GetStatJoueur() {
    }

    public GetStatJoueur(int idEquipe, String equipe, int idJoueur, String joueur, int nombreRebond, int nombrePoint, int nombrePasse, int nombreTir, int dureeSurTerrain) {
        this.idEquipe = idEquipe;
        this.equipe = equipe;
        this.idJoueur = idJoueur;
        this.joueur = joueur;
        this.nombreRebond = nombreRebond;
        this.nombrePoint = nombrePoint;
        this.nombrePasse = nombrePasse;
        this.nombreTir = nombreTir;
        this.dureeSurTerrain = dureeSurTerrain;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public int getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getJoueur() {
        return joueur;
    }

    public void setJoueur(String joueur) {
        this.joueur = joueur;
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

    public int getNombrePasse() {
        return nombrePasse;
    }

    public void setNombrePasse(int nombrePasse) {
        this.nombrePasse = nombrePasse;
    }

    public int getNombreTir() {
        return nombreTir;
    }

    public void setNombreTir(int nombreTir) {
        this.nombreTir = nombreTir;
    }

    public int getDureeSurTerrain() {
        return dureeSurTerrain;
    }

    public void setDureeSurTerrain(int dureeSurTerrain) {
        this.dureeSurTerrain = dureeSurTerrain;
    }
    
    public GetStatJoueur[] getStatJoueur(String idJoueur) throws Exception {
        GetStatJoueur[] stat = null;
        Object[] objet = null;
        int idJ = 0;
        int i=0;
        if(idJoueur!="") {
            idJ = Integer.parseInt(idJoueur);
            try {
                GetStatJoueur statJoueur = new GetStatJoueur();
                statJoueur.setIdJoueur(idJ);
                objet = dao().select(statJoueur, null);
                stat = new GetStatJoueur[objet.length];
                for(i=0; i<stat.length; i++) {
                    stat[i] = (GetStatJoueur) objet[i];
                }
            }
            catch(Exception ex) {
                throw ex;
            }
        }
        return stat;
    }
}
