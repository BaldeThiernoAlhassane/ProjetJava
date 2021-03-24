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
public class TestFiliere {
    public static void main (String args[]){
    Filiere l1 = new Filiere();
    l1.setNom("Programmation");
    l1.setDescription("Developpement");
    
    Filiere l2 = new Filiere("Reseaux");
    
    System.out.println(l1);
    System.out.println("*************************");
    System.out.println(l2);
    }
    
}
