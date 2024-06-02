// Nama : Krisna Okky Widayay
// NIM  : 24060122140105
 package Medium;
  
 import java.util.*;
 
 public class ArmadaKendaraan {
     private List<Vehicle> allArmada = new ArrayList<>();
     
     public void tambahArmada(List< ? extends Vehicle> armada){
         allArmada.addAll(armada);
     }
     
     public List<Vehicle> getAllArmada(){
         return allArmada;
     }
 }
 