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
public class Evaluation {
    private String type;
    private String date;
    private String duree;

    public Evaluation(){
    
    }
    
    public Evaluation(String type, String date, String duree){
        this.type = type;
        this.date = date;
        this.duree = duree;
    }
    
    public Evaluation(String type, String date){
        this.type = type;
        this.date = date;
    }
    
    
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "type=" + type + "\n date=" + date + "\n duree=" + duree + '}';
    }
    
    
    
}
