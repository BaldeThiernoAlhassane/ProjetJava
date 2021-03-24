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
public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private String telephone;
    
    public Etudiant(){
    
    }
    
    public Etudiant(String nom, String prenom, int age, String adresse, String telephone){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.telephone = telephone;
    }
    
    public Etudiant(String nom, String prenom, int age, String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void setTelephone(String Telephone) {
        this.telephone = Telephone;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "nom=" + nom + "\n prenom=" + prenom + "\n age=" + age + "\n adresse=" + adresse + "\n telephone=" + telephone + '}';
    }
    
    
}
