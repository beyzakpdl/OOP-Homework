/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_homework;

/**
 *
 * @author beyza
 */
public class Hatchback_Cars extends Cars {

    public Hatchback_Cars(String model, String colour, String brand, String fuel_Type, int year) {
        super(model, colour, brand, fuel_Type, year);

    }

    @Override
    public double CarPrice() {
        int rent;
        if (this.year >= 2020 && this.fuel_Type == "Electic") {
            rent = 1000;
        } else if (this.year >= 2020 || this.fuel_Type == "Electic") {
            rent = 900;
        } else {
            rent = 800;
        }
        return rent;
    }

    @Override
    public double DailyRentalPrice(int day) {
        double price = day * CarPrice();

        if (day >= 30) {
            double discount = price % 7;
            price -= discount;

        }
        return price;
    }

    @Override
    public double MonthlyRentalPrice(int month) {
        double price = month * CarPrice();
        if (month >= 3) {
            double discount = price % 7;
            price -= discount;

        }
        return price;
    }
}
