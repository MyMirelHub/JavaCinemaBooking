package com.pluralsight.MovieProj;

public class Multiplier extends MathEquation{
    public Multiplier(String ticketclass, int quantity, int ticketprice, String day){
        super(ticketclass,quantity,ticketprice,day);
    }

// Mathermatical logic equation
    @Override
    public void execute() {
        switch (getDay()) {
            case "Wednesday":
                int value = getTicketprice() * getQuantity() - (2* getQuantity());
                setResults(value);
                break;
            default:
                 value = getTicketprice() * getQuantity();
                setResults(value);

    }
}}

