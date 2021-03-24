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
public class TestProfesseur {
    
    public static void main(String args[]){
    Professeur r1 = new Professeur();
    r1.setNom("Diallo");
    r1.setPrenom("Mamadou");
    r1.setAdresse("Pikine");
    r1.setTelephone("77 193 18 30");
    
    Professeur r2 = new Professeur("Sylla", "Salif", "Dakar");
    
     System.out.println(r1);
    System.out.println("**********************************");
    System.out.println(r2);
    
    }
}
