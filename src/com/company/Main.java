package com.company;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Nursul", 1);
        Person person1 = new Person("Uluk", 1);
        Person person2 = new Person("asnl", 1);
        Person person3 = new Person("samat", 2);
        Person person4 = new Person("ajarkun", 2);
        Person person5 = new Person("Nurkasym", 3);
        Person person6 = new Person("alinur", 3);
        Person person7 = new Person("Maks", 3);
        Person person8 = new Person("Shaha", 3);

        Kvartira kvartira = new Kvartira(new Person[]{person, person1, person2});
        System.out.println(kvartira);
        System.out.println(kvartira.getPeople().length);
        kvartira.arenda();
        kvartira.komUslugi();
        System.out.println("-------------------------");
        Hotel hotel = new Hotel(new Person[]{person3, person4});
        System.out.println(hotel);
        System.out.println(hotel.getPeople().length);
        hotel.arenda();
        hotel.komUslugi();
        System.out.println("-------------------------");
        Obshijitie obshijitie = new Obshijitie(new Person[]{person5, person6, person7, person8});
        System.out.println(obshijitie);
        System.out.println(obshijitie.getPeople().length);
        obshijitie.arenda();
        obshijitie.komUslugi();
    }
}