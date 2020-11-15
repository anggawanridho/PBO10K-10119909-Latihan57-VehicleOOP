package vehicle;

/**
 * @author
 * NAMA     : Anggawan Ridho
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Skateboard extends Vehicle {
    private double myBoardLength;

    public Skateboard(){
        System.out.println("Skateboard");
    }

    public double getBoardLeght(){
        return myBoardLength;
    }

    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
}
