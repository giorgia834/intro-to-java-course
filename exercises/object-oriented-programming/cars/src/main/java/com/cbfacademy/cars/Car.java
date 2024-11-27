package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, String colour, int year) {
        this.make = make; /* only need to instantiate initially, otherwise undefined */
        this.model = model; 
        this.colour = colour; 
        this.year = year;}

    public String getMake() {
        return make; /* variables do not need to instantialised here */
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour; /* instantialisation required, new variable required, as you are setting up a variable to the same variable */
    }
    public String getDetails() {
        String details = String.format("This is a %s car, it is a %s %s. It has been made in the year %d", this.colour, this.make, this.model, this.year);
        return details;

    }
    

}
