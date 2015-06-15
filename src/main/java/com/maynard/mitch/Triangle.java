package com.maynard.mitch;

public class Triangle
{
    private String type;
    private int height;

    public Triangle( String type )
    {
        this.type = type;
    }

    public Triangle( int height )
    {
        this.height = height;
    }

    public Triangle( String type, int height )
    {
        this.type = type;
        this.height = height;
    }

    public void draw()
    {
        System.out.println( getType() + " triangle drawn of height " + getHeight() );
    }

    public String getType()
    {
        return type;
    }

    public int getHeight()
    {
        return height;
    }

    /*    public void setType( String type )
    {
        this.type = type;
    }*/
}
