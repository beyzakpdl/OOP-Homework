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
public class Individual extends Customer {

    private long id;

    public Individual(long id, String name, int phone, String city) {
        super(name, phone, city);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public long GetId() {
        return getId();

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
        final Individual other = (Individual) obj;
        return this.id == other.id;
    }

}
