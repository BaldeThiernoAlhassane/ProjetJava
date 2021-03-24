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
public class TestEvaluation {
    public static void main(String args[]){
    Evaluation e1 = new Evaluation();
    e1.setType("Ecrite");
    e1.setDate("22-01-2020");
    e1.setDuree("2h");
    
    Evaluation e2 = new Evaluation("Orale","08-02-2020");
    
    System.out.println(e1);
    System.out.println("**********************************");
    System.out.println(e2);
    
    
    }
    
}
