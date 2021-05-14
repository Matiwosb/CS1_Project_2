public class SquareClient {
    public void Square(){
        this.sideLength = 0.0;
    }
    public void Square(double sideLength){
        this.sideLength = sideLength;
    }
    public double getArea(double sideLength){
        return sideLength * sideLength;
    }
    }
}
