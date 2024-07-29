/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.oop_homework;

/**
 *
 * @author beyza
 */
public class OOP_Homework {

    public static void main(String[] args) {
        CarRentalFirm system = new CarRentalFirm();

        SEDAN_Cars car1 = new SEDAN_Cars("A1", "black", "A12", "Electic", 2021);
        SUV_Cars car2 = new SUV_Cars("B1", "white", "B12", "gasoline", 2018);
        Hatchback_Cars car3 = new Hatchback_Cars("C1", "yellow", "C12", "Electic", 2022);

        Company customer1 = new Company(123456789, "Ali", 21255427, "ist");
        Individual customer2 = new Individual(456789123, "Veli", 598742156, "ankara");

        system.AddCar(car1);
        system.AddCar(car2);
        system.AddCar(car3);
        system.AddCustomer(customer1);
        system.AddCustomer(customer2);
        
        system.RentCar(customer2, car3, 5, "Daily");
        system.RentCar(customer1, car2, 15, "Monthly");
        
        
        

    }
}
