/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.sound.midi.Soundbank;

/**
 *
 * @author beyza
 */
public class CarRentalFirm {

    private List<Cars> carList = new ArrayList<>();
    private HashSet<Customer> customerList = new HashSet();
    Set<List<Integer>> set = new HashSet<>();
    double price;

    public void AddCar(Cars car) {
        carList.add(car);
    }

    public void AddCustomer(Customer customer) {
        customerList.add(customer);
    }

    public void RentCar(Customer customer, Cars cars, int rentalDuration, String rentalType) {
        List list1 = new ArrayList<>();
        list1.add(customer);
        list1.add(cars);
        list1.add(rentalDuration);
        set.add(list1);
        if (rentalType == "Monthly") {
            if (cars instanceof SUV_Cars) {
                price = cars.MonthlyRentalPrice(rentalDuration);
            }
            if (cars instanceof SEDAN_Cars) {
                price = cars.MonthlyRentalPrice(rentalDuration);
            }
            if (cars instanceof Hatchback_Cars) {
                price = cars.MonthlyRentalPrice(rentalDuration);
            }
        }

        if (rentalType == "Daily") {
            if (cars instanceof SUV_Cars) {
                price = cars.DailyRentalPrice(rentalDuration);
            }
            if (cars instanceof SEDAN_Cars) {
                price = cars.DailyRentalPrice(rentalDuration);
            }
            if (cars instanceof Hatchback_Cars) {
                price = cars.DailyRentalPrice(rentalDuration);
            }

        }
        System.out.println("Total price : " + price);
    }

}
