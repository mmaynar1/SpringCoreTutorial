package com.maynard.mitch;

public class Triangle
{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw()
    {
        System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")\n" +
                           "Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")\n" +
                           "Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }

    public Point getPointA()
    {
        return pointA;
    }

    public void setPointA( Point pointA )
    {
        this.pointA = pointA;
    }

    public Point getPointB()
    {
        return pointB;
    }

    public void setPointB( Point pointB )
    {
        this.pointB = pointB;
    }

    public Point getPointC()
    {
        return pointC;
    }

    public void setPointC( Point pointC )
    {
        this.pointC = pointC;
    }
}