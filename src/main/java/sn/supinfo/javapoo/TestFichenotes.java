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
public class TestFichenotes {
    public static void main(String args []){
    FicheNotes f1 = new FicheNotes();
    f1.setNumfiche("047");
    f1.setDates("02-11-2021");
    
    FicheNotes f2 = new FicheNotes("048");
    
    System.out.println(f1);
    System.out.println("*******************************");
    System.out.println(f2);

   
    
}
}