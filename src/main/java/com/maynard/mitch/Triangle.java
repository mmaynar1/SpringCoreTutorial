package com.maynard.mitch;

public class Triangle
{
    private String type;

    public void draw()
    {
        System.out.println( getType() + " triangle drawn" );
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }
}
