public class Ba11 {
    private double x = 0.0;
    private double y = 0.0;


    public Ba11() {
    }

    public Ba11(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.y = y;
        this.x = x;
    }



    public void move(double xDisp, double yDisp) {
        y += yDisp;
        x += xDisp;
    }


    @Override public String toString() {
        return "Ball @ (" + x + ", " + y + ")";
    }
}