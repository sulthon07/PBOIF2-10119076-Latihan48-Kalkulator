/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan48.kalkulator;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Kalkulator
 */
public class PBOIF210119076Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        
        System.out.println("Value 1 = " + kalkulator.getValue1());
        System.out.println("Value 2 = " + kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Resul Add is = " + kalkulator.add(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.println("Resul Minus is = " + kalkulator.minus(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.println("Resul Multiple is = " + kalkulator.multiplication(kalkulator.getValue1(),kalkulator.getValue2()));
        System.out.println("Resul Division is = " + kalkulator.division(kalkulator.getValue1(),kalkulator.getValue2()));
    }
    
}
