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
public class TestSeance {
    public static void main(String args[]){
    Seance s1 = new Seance();
    s1.setDate("12-05-2010");
    s1.setHeuredebut("09h");
    s1.setHeurefin("12h");
    s1.setSoldeheure("20h");
    
    Seance s2 = new Seance("10h","14h");
    Seance s3 = new Seance("11h","13h", "20h");
    
    System.out.println(s1);
    System.out.println("******************************");
    System.out.println(s2);
    System.out.println("******************************");
    System.out.println(s3);
    
    
    }
    
}
