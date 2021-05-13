public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    public void Point2D(){
    }
    public void Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float []getXY(){
        float []Arr = {x,y};
        return Arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
