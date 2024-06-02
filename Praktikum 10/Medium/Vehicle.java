// Nama : Krisna Okky Widayay
// NIM  : 24060122140105

package Medium;

public abstract class Vehicle {
    public double calcFuelEffiecency;
    public double caclTripDistance;
  
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
