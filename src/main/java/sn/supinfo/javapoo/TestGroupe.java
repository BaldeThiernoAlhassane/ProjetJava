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
public class TestGroupe {
    public static void main(String args[]){
    Groupe g1 = new Groupe();
    g1.setNomgroupe("Reseaux");
    g1.setDatecreation("04-05-2000");
    
    Groupe g2 = new Groupe("Reseaux");
    
    System.out.println(g1);
    System.out.println("************************************");
    System.out.println(g2);


    
    
    }
    
}
