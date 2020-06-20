package com.company;

import com.company.People.Customer;
import com.company.People.Owner;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Owner Krycha = new Owner(100000, "Krystian", "Palkiewicz");
        Customer Mariuszek = new Customer (5000, "Mariusz", "Mucha");
        Customer Kuba = new Customer (8000, "Jakub", "Sroka");

        ArrayList<Car> OwnersCars = new ArrayList<>() ;
        OwnersCars.add(new Car("Renault","Clio",16000,2011));
        OwnersCars.add(new Car("BMW","e39",6000,1998));
        OwnersCars.add(new Car("Honda","Prelude",9000,1997));
        OwnersCars.add(new Car("Toyota","Corolla",4500,2001));
        OwnersCars.add(new Car("Renault","Clio",16000,2011));







    }
}
