// Nama : Krisna Okky Widayay
// NIM  : 24060122140105
package Medium;

public class Truck extends Vehicle{
    private double maxLoad;
    
    public Truck (double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double calcFuelEfficency(){
        return 0;
    }
    
    public double calcTripDistance(){
        return 0;
    }
    
    @Override
    public String toString(){
        return "Truck adalah angkutan darat yang sangat handal";
    }
}
