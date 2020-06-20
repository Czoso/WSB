package com.company;
import com.company.People.Customer;
import com.company.People.Human;
import com.company.People.Owner;

public class Car
{
    String name;
    String model;
    int year;
    int price;

    public Car ( String name, String model,int price, int year){
        this.model = model;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public void trade(Customer buyer, int price, Car Car)
    {
        while (buyer.getCash() < price)
        {
            if (buyer.getCar() == null)
            {
                buyer.setCar(Car);
                buyer.setCash(buyer.getCash() - price);
                Owner.setCash(Owner.getCash() + price);


            }
            else

                {
                System.out.println("you already have a car");
            }
        }
    }
}

