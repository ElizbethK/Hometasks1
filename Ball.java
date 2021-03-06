package com.homework;

public class Ball {
    private float x;
    private float y;
    private float xDelta;
    private float yDelta;
    private int radius;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float) (speed * Math.cos(direction));
        yDelta = (float) (-speed * Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal(){
        xDelta *= -1;
    }

    public void reflectVertical(){
        yDelta *= -1;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y
                + "),speed=" + "("
                + xDelta + "," + yDelta
                + ")]";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Float.compare(ball.x, x) == 0 && Float.compare(ball.y, y) == 0 && Float.compare(ball.xDelta, xDelta) == 0 && Float.compare(ball.yDelta, yDelta) == 0 && radius == ball.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, xDelta, yDelta, radius);

}
