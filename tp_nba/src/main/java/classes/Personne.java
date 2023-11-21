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
@AnnotationClass(table = "Personne")
public class Personne {
    @AnnotationField(attribut = "id")
    int id;
    @AnnotationField(attribut = "nom")
    String nom;
    @AnnotationField(attribut = "age")
    int age;

    public Personne() {
    }

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
