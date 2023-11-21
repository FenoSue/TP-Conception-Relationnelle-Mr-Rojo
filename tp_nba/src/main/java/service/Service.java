/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import classeViews.GetStatJoueur;
import classeViews.ListeJoueur;
import classeViews.StatistiqueJoueur;
import classes.Equipe;
import classes.HttpRetour;
import classes.PasseTir;
import classes.Rebond;
import classes.Statistique;

/**
 *
 * @author USER
 */
public class Service {
    HttpRetour retour = new HttpRetour();
    Rebond r = new Rebond();
    PasseTir p = new PasseTir();
    Statistique s = new Statistique();
    Equipe e = new Equipe();
    ListeJoueur l = new ListeJoueur();
    StatistiqueJoueur st = new StatistiqueJoueur();
    GetStatJoueur sj = new GetStatJoueur();
    
    public HttpRetour insertRebond(String idMatch, String idJoueur, String nombre, String typeRebond) throws Exception {
        Rebond rebond = r.insertRebond(idMatch, idJoueur, nombre, typeRebond);
        if(rebond!=null) {
            Object[] data = new Object[1];
            data[0] = rebond;
            retour.setHttpRetour(retour, 10, "Ok", data);
        }
        else {
            retour.setHttpRetour(retour, 20, "Erreur", null);
        }
        return retour;
    }
    
    public HttpRetour insertPasseTir(String idMatch, String idJoueur, String nombre, String types) throws Exception {
        PasseTir pass = p.insertPasseTir(idMatch, idJoueur, nombre, types);
        if(pass!=null) {
            Object[] data = new Object[1];
            data[0] = pass;
            retour.setHttpRetour(retour, 10, "Ok", data);
        }
        else {
            retour.setHttpRetour(retour, 20, "Erreur", null);
        }
        return retour;
    }
    
    public HttpRetour insertStatistique(String idMatch, String idJoueur, String point, String minutes) throws Exception {
        Statistique stat = s.insertStat(idMatch, idJoueur, point, minutes);
        if(stat!=null) {
            Object[] data = new Object[1];
            data[0] = stat;
            retour.setHttpRetour(retour, 10, "Ok", data);
        }
        else {
            retour.setHttpRetour(retour, 20, "Erreur", null);
        }
        return retour;
    }
    
    public HttpRetour listeEquipe() throws Exception {
        Equipe[] equipe = e.listeEquipe();
        if(equipe.length!=0) {
            retour.setHttpRetour(retour, 10, "Ok", equipe);
        }
        else {
            retour.setHttpRetour(retour, 20, "Erreur", null);
        }
        return retour;
    }
    
    public HttpRetour getJoueur(String idEquipe) throws Exception {
        ListeJoueur[] liste = l.getJoueur(idEquipe);
        if(liste.length!=0) {
            retour.setHttpRetour(retour, 10, "Ok", liste);
        }
        else {
            retour.setHttpRetour(retour, 20, "Erreur", null);
        }
        return retour;
    } 
    
    public HttpRetour getStatistiqueJoueur(String idJoueur) throws Exception {
        StatistiqueJoueur[] liste = st.getStatistiqueJoueur(idJoueur);
        if(liste.length!=0) {
            retour.setHttpRetour(retour, 10, "Ok", liste);
        }
        else {
            retour.setHttpRetour(retour, 20, "Erreur", null);
        }
        return retour;
    } 
    
    public HttpRetour getStatJoueur(String idJoueur) throws Exception {
        GetStatJoueur[] liste = sj.getStatJoueur(idJoueur);
        if(liste.length!=0) {
            retour.setHttpRetour(retour, 10, "Ok", liste);
        }
        else {
            retour.setHttpRetour(retour, 20, "Erreur", null);
        }
        return retour;
    } 
}
