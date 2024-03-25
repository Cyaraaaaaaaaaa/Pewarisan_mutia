/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan_mutia;

/**
 *
 * @author User
 */
public class Kendaraan {
    String merk;
    int kecepatan;
    String jenis;
    void melaju(int kecepatan){
        this.kecepatan=kecepatan;
        System.out.println("====MELAJU====");
        System.out.println("Kecepatan"+kecepatan+"Km/Jam");
    }
    void setAtribut(String merk,String jenis){
        this.merk=merk;
        this.jenis=jenis;
    }
    String getmerk(){
        return merk;
    }
    String getjenis(){
        return jenis;
    }
}
