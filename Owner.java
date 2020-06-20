package com.company.People;

public class Owner extends Human {
    int funds;
    public Owner(int funds, String FirstName, String LastName){

        super(FirstName, LastName);
        this.funds=funds;
    }
    public int getCash(){
        return funds;
    }
    public void setCash(int Cash)
    {
        this.funds = Cash;
    }



}
