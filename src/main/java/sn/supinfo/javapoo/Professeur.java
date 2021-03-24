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
public class Professeur {
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    
    public Professeur(){
    
    }
    
    public Professeur(String nom, String prenom, String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Professeur{" + "nom=" + nom + "\n prenom=" + prenom + "\n adresse=" + adresse + "\n telephone=" + telephone + '}';
    }
    
    
    
    
}
