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
public class Kalkulator {
    private double value1,value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject() {
        System.out.println("Project Kalkulator");
    }
    
    public void setNoteProject(String note) {
        System.out.println(note);
    }
    
    public double add (double val1,double val2) {
        return val1 + val2;
    }
    
    public double minus (double val1,double val2) {
        return val1 - val2;
    }
    
    public double multiplication (double val1,double val2) {
        return val1 * val2;
    }
    
    public double division (double val1,double val2) {
        return val1 / val2;

    }
}    
    
