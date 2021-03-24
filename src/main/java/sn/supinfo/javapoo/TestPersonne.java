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
public class TestPersonne{
     public static void main(String args []){
        Personne p1=new Personne();
        p1.setPrenom("Ali");
        p1.setNom("bah");
        p1.setAge(25);
        p1.setAdresse("Liberte5");
        p1.setTelephone("77 193 18 30");
        
        Personne p2 =new Personne("Fode", "Camara", "Pikine", 15, "78 303 78 72", "email");
        
        Personne p3 = new Personne("Jean-Pierre", "Jean");
        
        System.out.println(p1);
        System.out.println("------------------------------------------");
        System.out.println(p2);
        System.out.println("------------------------------------------");
        System.out.println(p3);
        
      
    }
}
