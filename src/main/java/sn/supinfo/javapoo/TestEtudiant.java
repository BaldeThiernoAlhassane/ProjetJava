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
public class TestEtudiant {
    public static void main(String args[]){
    Etudiant t1 = new Etudiant();
    t1.setNom("Balde");
    t1.setPrenom("Thierno Alhassane");
    t1.setAge(20);
    t1.setAdresse("Sacre-Coeur");
    t1.setTelephone("78 303 78 72");
    
    Etudiant t2 = new Etudiant("Sow", "Saliou", 18, "Dieuppeul");
    
    System.out.println(t1);
    System.out.println("**********************************");
    System.out.println(t2);
    }
    
}
