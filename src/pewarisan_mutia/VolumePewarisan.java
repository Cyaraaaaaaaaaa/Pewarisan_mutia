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
public class VolumePewarisan {
    int panjang;
    int tinggi;
    int lebar;
    
    void VolumeBalok(int panjang,int tinggi,int lebar){
        this.panjang=panjang;
        this.tinggi=tinggi;
        this.lebar=lebar;
        
        double volume;
        volume=panjang*tinggi*lebar;
        
        System.out.println("panjang; "+panjang+"Cm");
        System.out.println("tinggi; "+tinggi+"Cm");
        System.out.println("lebar; "+lebar+"Cm");
        System.out.println("jadi volumenya adalah" +volume+"cm kubik");
    }
      
    
}
