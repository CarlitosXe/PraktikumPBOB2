// Nama : Krisna Okky Widayay
// NIM  : 24060122140105

package Medium;

public abstract class Airplane extends Vehicle implements IFlyer{
    private double maxLoad;
    
    public Airplane (double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double calcFuelEfficiency(){
        return 0;
    }
    
    public double calcTripDistance(){
        return 0;
    }
}
