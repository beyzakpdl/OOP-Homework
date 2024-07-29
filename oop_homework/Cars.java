/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_homework;

/**
 *
 * @author beyza
 */
public abstract class Cars {

    String model;
    String colour;
    String brand;
    String fuel_Type;
    int year;
    

    public Cars(String model, String colour, String brand, String fuel_Type, int year) {
        this.model = model;
        this.colour = colour;
        this.brand = brand;
        this.fuel_Type = fuel_Type;
        this.year = year;
        
    }

    public abstract double DailyRentalPrice(int day);

    public abstract double MonthlyRentalPrice(int month);

    public abstract double CarPrice();

}
