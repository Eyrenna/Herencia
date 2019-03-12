package org.lasencinas;

public class Employee {

    private String name;

    //Constructor

    public Employee() {
    }


    //Seters

    public void setName(String name) {
        this.name = name;
    }


    //Geters

    public String getName() {
        return this.name;
    }


    //Métodos

    public boolean equals(Object obj) {
        boolean isEqual = false;
        // We compare objects of the Employee class with the objects of
        // Employee class or its descendants
        if (obj instanceof Employee) {
            // If two have the same name, consider them equal.
            Employee e = (Employee)obj;
            String n = e.getName();
            isEqual = n.equals(this.name);
        }

        return isEqual;
    }

}
