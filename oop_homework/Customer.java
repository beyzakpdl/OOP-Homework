/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_homework;

/**
 *
 * @author beyza
 */
public abstract class Customer {

    String name;
    int phone;
    String city;

    public Customer(String name, int phone, String city) {
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public abstract long GetId();

}
