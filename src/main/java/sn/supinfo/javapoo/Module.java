/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo;

/**
 *
 * @author THIERNO A. BALDE
 */
public class Module {
    private String nom;
    private String volumehoraire;
    private int coefficient;
    private String description;
    
    public Module(){
    
    }
    
    public Module(String nom, String volumehoraire){
        this.nom = nom;
        this.volumehoraire = volumehoraire;
    }
    
    public Module(String nom, String volumehoraire, int coefficient){
        this.nom = nom;
        this.volumehoraire = volumehoraire;
        this.coefficient = coefficient;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVolumehoraire() {
        return volumehoraire;
    }

    public void setVolumehoraire(String volumehoraire) {
        this.volumehoraire = volumehoraire;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Module{" + "nom=" + nom + "\n volumehoraire=" + volumehoraire + "\n coefficient=" + coefficient + "\n description=" + description + '}';
    }
    
    
    
}
