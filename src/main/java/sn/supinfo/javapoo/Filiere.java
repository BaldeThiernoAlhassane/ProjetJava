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
public class Filiere {
    private String nom;
    private String description;
    
    public Filiere(){
    
    }
    
     public Filiere(String nom){
         this.nom = nom;
    }
    
    
    
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Filiere{" + "nom=" + nom + "\n description=" + description + '}';
    }
    
    
    
    
}
