package com.maynard.mitch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp
{
    public static void main( String[] args )
    {
        //Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory( new FileSystemResource( "spring.xml" ) );
        ApplicationContext context = new ClassPathXmlApplicationContext( "spring.xml" ); //NOTE: Had to put this in resources package
        Triangle triangle = ( Triangle ) context.getBean( "triangle" );
        Triangle triangle2 = ( Triangle ) context.getBean( "triangle-alias" );
        Triangle triangle3 = ( Triangle ) context.getBean( "triangle-name" );
        triangle.draw();
        triangle2.draw();
        triangle3.draw();
    }
}
