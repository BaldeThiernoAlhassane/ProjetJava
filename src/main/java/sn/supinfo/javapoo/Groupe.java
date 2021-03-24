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
public class Groupe {
    private String nomgroupe;
    private String datecreation;

    
    public Groupe(){
    
    }
    
     public Groupe(String nomgroupe){
         this.nomgroupe = nomgroupe;
    }
    
    
    
    
    public String getNomgroupe() {
        return nomgroupe;
    }

    public void setNomgroupe(String nomgroupe) {
        this.nomgroupe = nomgroupe;
    }

    public String getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(String datecreation) {
        this.datecreation = datecreation;
    }

    @Override
    public String toString() {
        return "Groupe{" + "nomgroupe=" + nomgroupe + "\n datecreation=" + datecreation + '}';
    }
    
    
    
    
}
