package org.example;

import db.DataBase;

import static db.DataBase.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        DataBase.createTableMayor();
        DataBase.getAllMayor();





        DataBase.getAllCountry();
        System.out.println(DataBase.callByIdCities(3));




    }
}
