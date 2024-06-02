/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medium;

/**
 *
 * @author faisa
 */

 /*
 * Nama : Mohamad Faisal Rizki
 * NIM  : 24060122130068
 * Nama File : Helicopter.java
 * Deskripsi : File class dari helicopter
 */


public class Helicopter extends Airplane {
    public double maxLoad;
    
    public Helicopter (double maxLoad){
        super(maxLoad);
    }
    
    @Override
    public double calcFuelEfficiency(){
        return 0;
    }
    
    @Override
    public double calcTripDistance(){
        return 0;
    }
    
    @Override
    public void takeOff(){
        
    }
    
    @Override
    public void land(){
        
    }
    
    @Override
    public void fly(){
        
    }
    
    @Override
    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
