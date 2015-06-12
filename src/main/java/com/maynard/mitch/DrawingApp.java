package com.maynard.mitch;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp
{
    public static void main( String[] args )
    {
        //Triangle triangle = new Triangle();
        BeanFactory beanFactory = new XmlBeanFactory( new FileSystemResource( "spring.xml" ) );
        Triangle triangle = (Triangle) beanFactory.getBean( "triangle" );
        triangle.draw();
    }
}
