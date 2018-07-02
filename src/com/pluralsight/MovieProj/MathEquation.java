package com.pluralsight.MovieProj;

// Abstract class which handles the primary arithmetic variables.

public abstract class MathEquation {
    private int ticketprice;
    private int quantity;
    private String ticketclass;
    private int results;
    private String day;

// getters and setters of key variables

    public String getDay() {return day;}
    public void setDay(String day) {this.day = day;}
    public int getTicketprice() {return ticketprice;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public int getResults() {return results;} // for result only need accessor but not mutator - read only
    public void setResults(int results) {this.results = results;}

// Constructors

    public MathEquation(int ticketprice, int quantity, String day) {} // blank contructor for no argument
    public MathEquation(String ticketclass) {
        this.ticketclass = ticketclass;}

    public MathEquation(String ticketclass, int quantity, int ticketprice, String day) {
        this(ticketclass); // chains to the other constructor
        this.quantity = quantity;
        this.ticketprice = ticketprice;
        this.day = day;
    }

// Maths equation abstraction to calculate number of seats
    public abstract void execute();
}


