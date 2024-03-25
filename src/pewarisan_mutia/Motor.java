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

public class Motor extends Kendaraan {
    public static void main(String[]args){
        Motor data=new Motor();
        data.setAtribut("BMW","Motor");
        System.out.println("Jenis Kendaraan;" +data.getjenis());
        System.out.println("Merk Kendaraan;" +data.getmerk());
        data.melaju(150);
                
    }
}
