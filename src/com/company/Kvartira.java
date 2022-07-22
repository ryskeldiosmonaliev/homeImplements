package com.company;

import java.util.Arrays;

public class Kvartira extends Home {

    public Kvartira(Person[] people) {
        super(people);
    }

    @Override
    void komUslugi() {
        System.out.println("ком усю толойбу Ооба");
    }

    @Override
    void arenda() {
        System.out.println(" аренда толойбу Жок");
    }

    @Override
    public String toString() {
        return "Kvartira{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}




