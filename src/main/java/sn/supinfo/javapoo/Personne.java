/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo;

public class Personne{
    private String prenom;
    private String nom;
    private String adresse;
    private int age;
    private String telephone;
    private String email;
    
    public Personne(){
        
    }
    
    public Personne(String prenom, String nom, String adresse, int age, String tel, String email){
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.age = age;
        this.telephone = tel;
        this.email = email;
    }
    
    public Personne(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }
    
    
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Personne{" + "prenom=" + prenom + "\n nom=" + nom + "\n adresse=" + adresse + "\n age=" + age + "\n telephone=" + telephone + "\n email=" + email + '}';
    }

    
  
}
