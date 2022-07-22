package com.company;

import java.util.Arrays;

public class Hotel extends Home{

    public Hotel(Person[] people) {
        super(people);
    }



    @Override
    void komUslugi() {
        System.out.println("ком ус толойбу Жок");
    }

    @Override
    void arenda() {
        System.out.println("аренда толойбу Ооба");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
