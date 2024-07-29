/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_homework;

import java.util.Objects;

/**
 *
 * @author beyza
 */
public class Company extends Customer {

    private long tax_Number;

    public Company(long tax_Number, String name, int phone, String city) {
        super(name, phone, city);
        this.tax_Number = tax_Number;
    }

    /**
     * @return the tax_Number
     */
    public long getTax_Number() {
        return tax_Number;
    }

    @Override
    public long GetId() {
        return getTax_Number();

    }

    @Override
    public int hashCode() {

        return Objects.hashCode(getClass());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Company other = (Company) obj;
        return this.tax_Number == other.tax_Number;
    }

}
