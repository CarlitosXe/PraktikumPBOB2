// Nama : Krisna Okky Widayay
// NIM  : 24060122140105
package Medium;

public abstract class Animal {
    public abstract void eat();
    
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
