package com.company.People;
import com.company.Car;

public class Customer extends Human {

    private int wallet;

    public Customer(int wallet, String FirstName, String LastName)

    {
        super(FirstName, LastName);
        this.wallet = wallet;


    }

    public int getCash(){
        return wallet;
    }
    public Car getCar() {

        return Customer.getCar();
    }
    public void setCash(int Cash)
    {
        this.wallet = Cash;
    }




}
