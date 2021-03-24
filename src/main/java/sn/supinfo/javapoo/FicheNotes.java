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
public class FicheNotes {
    private String numfiche;
    private String dates;

    
    public FicheNotes(){
    
    }
    
    public FicheNotes(String numfiche){
        this.numfiche = numfiche;
    }
    
    
    public FicheNotes(String numfiche, String dates){
        this.numfiche = numfiche;
        this.dates = dates;
    }
    
    
    
    public String getNumfiche() {
        return numfiche;
    }

    public void setNumfiche(String numfiche) {
        this.numfiche = numfiche;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "FicheNotes{" + "numfiche=" + numfiche + "\n dates=" + dates + '}';
    }
    
    
    
}
