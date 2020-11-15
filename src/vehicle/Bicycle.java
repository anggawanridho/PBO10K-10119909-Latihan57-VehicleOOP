package vehicle;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle(){
        System.out.println("Bicycle");
    }

    public int getGearCount(){
        return myGearCount;
    }

    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}
