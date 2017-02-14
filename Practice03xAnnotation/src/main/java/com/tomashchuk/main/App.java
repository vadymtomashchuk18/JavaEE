package com.tomashchuk.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    /*    public static void main( String[] args )
        {
            System.out.println( "Hello World!" );
        }
    */
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "/**/SpringBean.xml", "/**/xxx.xml"});
        Product product1 = (Product) context.getBean("product1");
        System.out.println(product1.toString());
        Product product2 = (Product) context.getBean("product2");
        System.out.println(product2.toString());
        Product product3 = (Product) context.getBean("product3");
        System.out.println(product3.toString());

        IceCreamSeller iccrsel = (IceCreamSeller) context.getBean("IceCream_seller");
        iccrsel.showAllIceCreams();
    }
}

