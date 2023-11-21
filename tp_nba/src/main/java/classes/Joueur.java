/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import annotations.AnnotationClass;
import annotations.AnnotationField;

/**
 *
 * @author USER
 */
@AnnotationClass(table = "Joueur")
public class Joueur {
    @AnnotationField(attribut = "id")
    int id;
    @AnnotationField(attribut = "idPersonne")
    int idPersonne;
    @AnnotationField(attribut = "idEquipe")
    int idEquipe;

    public Joueur() {
    }

    public Joueur(int idPersonne, int idEquipe) {
        this.idPersonne = idPersonne;
        this.idEquipe = idEquipe;
    }
    
}
