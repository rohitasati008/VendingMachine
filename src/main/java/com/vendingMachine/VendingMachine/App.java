package com.vendingMachine.VendingMachine;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan("com.vendingMachine")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
