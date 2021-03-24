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
public class TestModule {
    public static void main (String args[]){
    Module m1 = new Module();
    m1.setNom("Java");
    m1.setVolumehoraire("20h");
    m1.setCoefficient(3);
    m1.setDescription("langage de programmation");
    
    Module m2 = new Module("Python","20h");
    Module m3 = new Module("JavaScript","20h", 2);
    
    System.out.println(m1);
    System.out.println("*******************************");
    System.out.println(m2);
    System.out.println("*******************************");
    System.out.println(m3);
    
    }
    
}
