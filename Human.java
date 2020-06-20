package com.company.People;
import com.company.Car;

public class Human {
    private String FirstName;
    private String LastName;
    private Car Car;
    public Human(String FirstName, String LastName){

    }


    public Car getCar() {
        return Car;
    }
    public void setCar(Car car)
    {
        this.Car = car;
    }

}


