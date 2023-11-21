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
@AnnotationClass(table = "ListeJoueur")
public class ListeJoueur {
    @AnnotationField(attribut = "idEquipe")
    int idEquipe;
    @AnnotationField(attribut = "equipe")
    String equipe;
    @AnnotationField(attribut = "idJoueur")
    int idJoueur;
    @AnnotationField(attribut = "Joueur")
    String joueur;

    public ListeJoueur() {
    }

    public ListeJoueur(int idEquipe, String equipe, int idJoueur, String joueur) {
        this.idEquipe = idEquipe;
        this.equipe = equipe;
        this.idJoueur = idJoueur;
        this.joueur = joueur;
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
    
    public ListeJoueur[] getJoueur(String idEquipe) throws Exception {
        ListeJoueur[] liste = null;
        Object[] objet = null;
        int idE = 0;
        int i=0;
        if(idEquipe!="") {
            idE = Integer.parseInt(idEquipe);
            try {
                ListeJoueur j = new ListeJoueur();
                j.setIdEquipe(idE);
                objet = dao().select(j, null);
                liste = new ListeJoueur[objet.length];
                for(i=0; i<liste.length; i++) {
                    liste[i] = (ListeJoueur) objet[i];
                }
            }
            catch(Exception ex) {
                throw ex;
            }
        }
        return liste;
    }
}
