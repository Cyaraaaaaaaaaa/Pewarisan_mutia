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
public class VolumeKubus {
  int sisi;
    int sisi2;
    int sisi3;
   
    void VolumeKubus(int sisi,int sisi2,int sisi3){
        this.sisi = sisi;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
      double volume;
        volume=sisi*sisi*sisi;
        
        System.out.println("sisi; "+sisi+"Cm");
        System.out.println("sisi2; "+sisi2+"Cm");
        System.out.println("sisi3; "+sisi3+"Cm");
        
        System.out.println("jadi volumenya adalah" +volume+"Cm");
    }
      
    
}
