package vehicle;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Vehicle {
    private String myBrand;
    private String myModel;

    public Vehicle(){

    }

    public String getBrand(){
        return myBrand;
    }

    public void setBrand(String brand){
        this.myBrand = brand;
    }

    public String getModel(){
        return myModel;
    }

    public void setModel(String model){
        this.myModel = model;
    }
}
