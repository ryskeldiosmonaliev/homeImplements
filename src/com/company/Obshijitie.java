package com.company;

import java.util.Arrays;

public class Obshijitie extends Home {


    public Obshijitie(Person[] people) {
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
        return "Obshijitie{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
