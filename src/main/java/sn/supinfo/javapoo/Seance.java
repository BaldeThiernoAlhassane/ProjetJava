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
public class Seance {
    private String date;
    private String heuredebut;
    private String heurefin;
    private String soldeheure;
    
    public Seance(){
    
    }
    
    public Seance(String heuredebut, String heurefin){
        this.heuredebut = heuredebut;
        this.heurefin = heurefin;
    }
    
    public Seance(String heuredebut, String heurefin, String soldeheure){
        this.heuredebut = heuredebut;
        this.heurefin = heurefin;
        this.soldeheure = soldeheure;
    }
    
    
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeuredebut() {
        return heuredebut;
    }

    public void setHeuredebut(String heuredebut) {
        this.heuredebut = heuredebut;
    }

    public String getHeurefin() {
        return heurefin;
    }

    public void setHeurefin(String heurefin) {
        this.heurefin = heurefin;
    }

    public String getSoldeheure() {
        return soldeheure;
    }

    public void setSoldeheure(String soldeheure) {
        this.soldeheure = soldeheure;
    }

    @Override
    public String toString() {
        return "Seance{" + "date=" + date + "\n heuredebut=" + heuredebut + "\n heurefin=" + heurefin + "\n soldeheure=" + soldeheure + '}';
    }
    
    
    
}
